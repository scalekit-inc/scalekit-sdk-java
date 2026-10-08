package com.scalekit;

import com.scalekit.api.ActionsClient;
import com.scalekit.api.ConnectedAccountsClient;
import com.scalekit.api.McpClient;
import com.scalekit.api.ProvidersClient;
import com.scalekit.api.ToolsClient;
import com.scalekit.exceptions.AuthenticationException;
import com.scalekit.exceptions.BadRequestException;
import com.scalekit.exceptions.ConflictException;
import com.scalekit.exceptions.InternalServerException;
import com.scalekit.exceptions.NotFoundException;
import com.scalekit.exceptions.PermissionDeniedException;
import com.scalekit.exceptions.ProxyException;
import com.scalekit.exceptions.RateLimitException;
import com.scalekit.exceptions.ScalekitConnectionException;
import com.scalekit.exceptions.ScalekitTimeoutException;
import com.scalekit.exceptions.ToolException;
import com.scalekit.exceptions.ToolForbiddenException;
import com.scalekit.exceptions.ToolRateLimitException;
import com.scalekit.exceptions.ToolUnauthorizedException;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The surface added in 2.6.0 exposes only JDK and SDK types: no generated protobuf, gRPC, Jackson
 * or shaded types, and nothing from the internal or implementation packages.
 */
class PublicSignatureTest {

    private static final String[] MODEL_PACKAGES = {
            "com.scalekit.models", "com.scalekit.models.tools", "com.scalekit.models.connectedaccounts",
            "com.scalekit.models.mcp", "com.scalekit.models.providers", "com.scalekit.models.proxy"};

    private static final List<Class<?>> NEW_TYPES = Arrays.<Class<?>>asList(
            ToolsClient.class, ConnectedAccountsClient.class, ActionsClient.class, McpClient.class, ProvidersClient.class,
            BadRequestException.class, AuthenticationException.class, PermissionDeniedException.class,
            NotFoundException.class, ConflictException.class, RateLimitException.class, InternalServerException.class,
            ScalekitTimeoutException.class, ScalekitConnectionException.class, ToolException.class,
            ToolUnauthorizedException.class, ToolForbiddenException.class, ToolRateLimitException.class,
            ProxyException.class);

    @Test
    void newPublicSignaturesUseOnlyJdkAndSdkTypes() throws Exception {
        List<Class<?>> types = new ArrayList<>(NEW_TYPES);
        for (String pkg : MODEL_PACKAGES) {
            types.addAll(classesIn(pkg));
        }
        assertTrue(types.size() > 40, "found " + types.size() + " types");
        List<String> violations = new ArrayList<>();
        for (Class<?> type : types) {
            check(type, violations);
        }
        for (String accessor : Arrays.asList("tools", "connectedAccounts", "actions")) {
            Method method = ScalekitClient.class.getMethod(accessor);
            checkType(method.getGenericReturnType(), "ScalekitClient." + accessor, violations);
        }
        assertTrue(violations.isEmpty(), String.join("\n", violations));
    }

    private static void check(Class<?> type, List<String> violations) {
        if (!Modifier.isPublic(type.getModifiers())) {
            return;
        }
        for (Method method : type.getDeclaredMethods()) {
            if (!exposed(method.getModifiers()) || method.isSynthetic() || method.isBridge()) {
                continue;
            }
            // Members inherited from APIException predate 2.6.0 and are outside this check.
            String where = type.getName() + "." + method.getName();
            checkType(method.getGenericReturnType(), where, violations);
            for (Type parameter : method.getGenericParameterTypes()) {
                checkType(parameter, where, violations);
            }
        }
        for (Constructor<?> constructor : type.getDeclaredConstructors()) {
            if (!exposed(constructor.getModifiers()) || constructor.isSynthetic()) {
                continue;
            }
            for (Type parameter : constructor.getGenericParameterTypes()) {
                checkType(parameter, type.getName() + ".<init>", violations);
            }
        }
        for (Field field : type.getDeclaredFields()) {
            if (exposed(field.getModifiers()) && !field.isSynthetic()) {
                checkType(field.getGenericType(), type.getName() + "." + field.getName(), violations);
            }
        }
        for (Class<?> nested : type.getDeclaredClasses()) {
            check(nested, violations);
        }
    }

    private static boolean exposed(int modifiers) {
        return Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers);
    }

    private static void checkType(Type type, String where, List<String> violations) {
        if (type instanceof Class) {
            Class<?> raw = (Class<?>) type;
            while (raw.isArray()) {
                raw = raw.getComponentType();
            }
            if (raw.isPrimitive()) {
                return;
            }
            String name = raw.getName();
            boolean allowed = name.startsWith("java.")
                    || name.startsWith("com.scalekit.models.")
                    || name.startsWith("com.scalekit.api.") && !name.startsWith("com.scalekit.api.impl.")
                    && !name.startsWith("com.scalekit.api.util.")
                    || name.startsWith("com.scalekit.exceptions.");
            if (!allowed) {
                violations.add(where + " exposes " + name);
            }
        } else if (type instanceof ParameterizedType) {
            checkType(((ParameterizedType) type).getRawType(), where, violations);
            for (Type argument : ((ParameterizedType) type).getActualTypeArguments()) {
                checkType(argument, where, violations);
            }
        } else if (type instanceof WildcardType) {
            for (Type bound : ((WildcardType) type).getUpperBounds()) {
                checkType(bound, where, violations);
            }
            for (Type bound : ((WildcardType) type).getLowerBounds()) {
                checkType(bound, where, violations);
            }
        } else if (type instanceof GenericArrayType) {
            checkType(((GenericArrayType) type).getGenericComponentType(), where, violations);
        } else if (type instanceof TypeVariable) {
            for (Type bound : ((TypeVariable<?>) type).getBounds()) {
                checkType(bound, where, violations);
            }
        }
    }

    private static List<Class<?>> classesIn(String pkg) throws Exception {
        List<Class<?>> classes = new ArrayList<>();
        Enumeration<URL> urls = PublicSignatureTest.class.getClassLoader().getResources(pkg.replace('.', '/'));
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            assertEquals("file", url.getProtocol(), "run this test on compiled classes");
            File[] files = new File(url.toURI()).listFiles();
            assertNotNull(files);
            for (File file : files) {
                String fileName = file.getName();
                if (fileName.endsWith(".class") && !fileName.contains("$") && !fileName.equals("package-info.class")) {
                    classes.add(Class.forName(pkg + "." + fileName.substring(0, fileName.length() - ".class".length())));
                }
            }
        }
        assertFalse(classes.isEmpty(), "package " + pkg + " not found");
        return classes;
    }
}

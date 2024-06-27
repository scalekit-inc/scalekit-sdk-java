# Scalekit Java SDK

[![Maven Central](https://img.shields.io/badge/maven--central-v0.1-blue)]()
[![JavaDoc](http://img.shields.io/badge/javadoc-reference-blue.svg)]()





## Installation

### Requirements
- Java 1.8 or later

### Gradle users

Add this dependency to your project's build file:

```gradle
implementation "com.scalekit:scalekit-sdk-java:0.1-SNAPSHOT"
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.scalekit</groupId>
    <artifactId>scalekit-sdk-java</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>
```

## Documentation
Please see the [Java API docs][api-docs]



## Usage

```java
import com.scalekit.ScalekitClient;
import com.scalekit.exceptions.APIException;
import com.scalekit.grpc.scalekit.v1.organizations.CreateOrganization;
import com.scalekit.grpc.scalekit.v1.organizations.Organization;
import com.scalekit.grpc.scalekit.v1.organizations.UpdateOrganization;

public class ScalekitExample {

    public static void main(String[] args) {
        client = new ScalekitClient("environment url",
                "skc_...",
                "sk_test_...");
        CreateOrganization params = CreateOrganization.newBuilder()
                .setDisplayName("Test Organization")
                .putMetadata("testKey","testValue")
                .build();

        try {
            Organization createdOrganization  = client.Organizations().Create(params);
            System.out.println(Organization);
        } catch (APIException e) {
            e.printStackTrace();
        }
    }
}
```

See the project's [functional tests][functional-tests] for more examples.

[api-docs]: https://docs.scalekit.com/apis
[functional-tests]: https://github.com/scalekit-inc/scalekit-sdk-java/tree/0.1-SNAPSHOT/src/test/java

<!--
# vim: set tw=79:
-->
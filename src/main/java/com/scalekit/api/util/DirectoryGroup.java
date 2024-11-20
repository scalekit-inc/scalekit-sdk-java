package com.scalekit.api.util;

import com.google.protobuf.*;
import com.google.protobuf.util.JsonFormat;

import java.util.List;
import java.util.Map;

public class DirectoryGroup {

    private final com.scalekit.grpc.scalekit.v1.directories.DirectoryGroup directoryGroup;
    private final String groupDetail;

    public DirectoryGroup(com.scalekit.grpc.scalekit.v1.directories.DirectoryGroup directoryGroup) {
        JsonFormat.Printer printer = JsonFormat.printer();
        this.directoryGroup = directoryGroup;
        try {
            this.groupDetail = printer.print(directoryGroup.getGroupDetail());
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getId() {
        return directoryGroup.getId();
    }

    
    public ByteString getIdBytes() {
        return directoryGroup.getIdBytes();
    }

    
    public String getDisplayName() {
        return directoryGroup.getDisplayName();
    }

    
    public ByteString getDisplayNameBytes() {
        return directoryGroup.getDisplayNameBytes();
    }

    
    public int getTotalUsers() {
        return directoryGroup.getTotalUsers();
    }

    
    public boolean hasUpdatedAt() {
        return directoryGroup.hasUpdatedAt();
    }

    
    public Timestamp getUpdatedAt() {
        return directoryGroup.getUpdatedAt();
    }

    
    public boolean hasGroupDetail() {
        return directoryGroup.hasGroupDetail();
    }

    
    public String getGroupDetail() {
        return groupDetail;
    }


    
    public Message getDefaultInstanceForType() {
        return directoryGroup.getDefaultInstanceForType();
    }

    
    public boolean isInitialized() {
        return directoryGroup.isInitialized();
    }

    
    public List<String> findInitializationErrors() {
        return directoryGroup.findInitializationErrors();
    }

    
    public String getInitializationErrorString() {
        return directoryGroup.getInitializationErrorString();
    }

    
    public Descriptors.Descriptor getDescriptorForType() {
        return directoryGroup.getDescriptorForType();
    }

    
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return directoryGroup.getAllFields();
    }

    
    public boolean hasOneof(Descriptors.OneofDescriptor oneof) {
        return directoryGroup.hasOneof(oneof);
    }

    
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneof) {
        return directoryGroup.getOneofFieldDescriptor(oneof);
    }

    
    public boolean hasField(Descriptors.FieldDescriptor field) {
        return directoryGroup.hasField(field);
    }

    
    public Object getField(Descriptors.FieldDescriptor field) {
        return directoryGroup.getField(field);
    }

    
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor field) {
        return directoryGroup.getRepeatedFieldCount(field);
    }

    
    public Object getRepeatedField(Descriptors.FieldDescriptor field, int index) {
        return directoryGroup.getRepeatedField(field, index);
    }

    
    public UnknownFieldSet getUnknownFields() {
        return directoryGroup.getUnknownFields();
    }
}

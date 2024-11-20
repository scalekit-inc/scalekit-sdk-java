package com.scalekit.api.util;

import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.scalekit.grpc.scalekit.v1.directories.ListDirectoryGroupsResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListDirectoryGroupResponse {
    private final ListDirectoryGroupsResponse grpcListDirectoryGroupsResponse;
    private final List<DirectoryGroup> groupsList;

    public ListDirectoryGroupResponse(ListDirectoryGroupsResponse grpcListDirectoryGroupsResponse) {
        this.grpcListDirectoryGroupsResponse = grpcListDirectoryGroupsResponse;
        this.groupsList = new ArrayList<>();
        for (com.scalekit.grpc.scalekit.v1.directories.DirectoryGroup group : grpcListDirectoryGroupsResponse.getGroupsList()) {
            this.groupsList.add(new DirectoryGroup(group));
        }
    }


    
    public List<DirectoryGroup> getGroupsList() {
        return groupsList;
    }

    
    public DirectoryGroup getGroups(int index) {
       return groupsList.get(index);
    }

    
    public int getGroupsCount() {
        return groupsList.size();
    }

    
    public int getTotalSize() {
        return grpcListDirectoryGroupsResponse.getTotalSize();
    }

    
    public String getNextPageToken() {
        return grpcListDirectoryGroupsResponse.getNextPageToken();
    }

    
    public ByteString getNextPageTokenBytes() {
        return grpcListDirectoryGroupsResponse.getNextPageTokenBytes();
    }

    
    public String getPrevPageToken() {
        return grpcListDirectoryGroupsResponse.getPrevPageToken();
    }

    
    public ByteString getPrevPageTokenBytes() {
        return grpcListDirectoryGroupsResponse.getPrevPageTokenBytes();
    }

    
    public Message getDefaultInstanceForType() {
        return grpcListDirectoryGroupsResponse.getDefaultInstanceForType();
    }

    
    public boolean isInitialized() {
        return grpcListDirectoryGroupsResponse.isInitialized();
    }

    
    public List<String> findInitializationErrors() {
        return grpcListDirectoryGroupsResponse.findInitializationErrors();
    }

    
    public String getInitializationErrorString() {
        return grpcListDirectoryGroupsResponse.getInitializationErrorString();
    }

    
    public Descriptors.Descriptor getDescriptorForType() {
        return grpcListDirectoryGroupsResponse.getDescriptorForType();
    }

    
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return grpcListDirectoryGroupsResponse.getAllFields();
    }

    
    public boolean hasOneof(Descriptors.OneofDescriptor oneof) {
        return grpcListDirectoryGroupsResponse.hasOneof(oneof);
    }

    
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneof) {
        return grpcListDirectoryGroupsResponse.getOneofFieldDescriptor(oneof);
    }

    
    public boolean hasField(Descriptors.FieldDescriptor field) {
        return grpcListDirectoryGroupsResponse.hasField(field);
    }

    
    public Object getField(Descriptors.FieldDescriptor field) {
        return grpcListDirectoryGroupsResponse.getField(field);
    }

    
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor field) {
        return grpcListDirectoryGroupsResponse.getRepeatedFieldCount(field);
    }

    
    public Object getRepeatedField(Descriptors.FieldDescriptor field, int index) {
        return grpcListDirectoryGroupsResponse.getRepeatedField(field, index);
    }

    
    public UnknownFieldSet getUnknownFields() {
        return grpcListDirectoryGroupsResponse.getUnknownFields();
    }
}

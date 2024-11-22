package com.scalekit.api.util;


import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import com.scalekit.grpc.scalekit.v1.directories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListDirectoryUserResponse {


    private final ListDirectoryUsersResponse grpcListDirectoryUsersResponse;
    private final List<DirectoryUser> usersList;

    public ListDirectoryUserResponse(ListDirectoryUsersResponse grpcListDirectoryUsersResponse) {
        this.grpcListDirectoryUsersResponse = grpcListDirectoryUsersResponse;
        this.usersList = new ArrayList<>();
        for (com.scalekit.grpc.scalekit.v1.directories.DirectoryUser user : grpcListDirectoryUsersResponse.getUsersList()) {
            this.usersList.add(new DirectoryUser(user));
        }
    }


    public List<DirectoryUser> getUsersList() {
        return this.usersList;
    }


    public DirectoryUser getUsers(int index) {
        return this.usersList.get(index);
    }

    public int getUsersCount() {
        return this.usersList.size();
    }


    public int getTotalSize() {
        return grpcListDirectoryUsersResponse.getTotalSize();
    }

    public String getNextPageToken() {
        return this.grpcListDirectoryUsersResponse.getNextPageToken();
    }

    public ByteString getNextPageTokenBytes() {
        return this.grpcListDirectoryUsersResponse.getNextPageTokenBytes();
    }

    public String getPrevPageToken() {
        return this.grpcListDirectoryUsersResponse.getPrevPageToken();
    }

    public ByteString getPrevPageTokenBytes() {
        return this.grpcListDirectoryUsersResponse.getPrevPageTokenBytes();
    }

    public Message getDefaultInstanceForType() {
        return this.grpcListDirectoryUsersResponse.getDefaultInstanceForType();
    }

    public boolean isInitialized() {
        return this.grpcListDirectoryUsersResponse.isInitialized();
    }

    public List<String> findInitializationErrors() {
        return this.grpcListDirectoryUsersResponse.findInitializationErrors();
    }

    public String getInitializationErrorString() {
        return this.grpcListDirectoryUsersResponse.getInitializationErrorString();
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return this.grpcListDirectoryUsersResponse.getDescriptorForType();
    }

    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return this.grpcListDirectoryUsersResponse.getAllFields();
    }

    public boolean hasOneof(Descriptors.OneofDescriptor oneof) {
        return this.grpcListDirectoryUsersResponse.hasOneof(oneof);
    }

    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneof) {
        return this.grpcListDirectoryUsersResponse.getOneofFieldDescriptor(oneof);
    }

    public boolean hasField(Descriptors.FieldDescriptor field) {
        return this.grpcListDirectoryUsersResponse.hasField(field);
    }

    public Object getField(Descriptors.FieldDescriptor field) {
        return this.grpcListDirectoryUsersResponse.getField(field);
    }

    public int getRepeatedFieldCount(Descriptors.FieldDescriptor field) {
        return this.grpcListDirectoryUsersResponse.getRepeatedFieldCount(field);
    }

    public Object getRepeatedField(Descriptors.FieldDescriptor field, int index) {
        return this.grpcListDirectoryUsersResponse.getRepeatedField(field, index);
    }

    public UnknownFieldSet getUnknownFields() {
        return this.grpcListDirectoryUsersResponse.getUnknownFields();
    }
}

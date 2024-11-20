package com.scalekit.api.util;

import com.google.protobuf.*;
import com.google.protobuf.util.JsonFormat;
import com.scalekit.grpc.scalekit.v1.directories.DirectoryGroup;
import com.scalekit.grpc.scalekit.v1.directories.DirectoryGroupOrBuilder;
import lombok.Data;

import java.util.List;
import java.util.Map;


@Data
public class DirectoryUser {

    private final  com.scalekit.grpc.scalekit.v1.directories.DirectoryUser directoryUser;
    private final String userDetails;

    public DirectoryUser(com.scalekit.grpc.scalekit.v1.directories.DirectoryUser directoryUser) {

        JsonFormat.Printer printer = JsonFormat.printer();
        this.directoryUser = directoryUser;
        try {
            this.userDetails = printer.print(directoryUser.getUserDetail());
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }

    
    public String getId() {
        return directoryUser.getId();
    }

    
    public ByteString getIdBytes() {
        return directoryUser.getIdBytes();
    }

    
    public String getEmail() {
        return directoryUser.getEmail();
    }

    
    public ByteString getEmailBytes() {
        return directoryUser.getEmailBytes();
    }

    
    public String getPreferredUsername() {
        return directoryUser.getPreferredUsername();
    }

    
    public ByteString getPreferredUsernameBytes() {
        return directoryUser.getPreferredUsernameBytes();
    }

    
    public String getGivenName() {
        return directoryUser.getGivenName();
    }

    
    public ByteString getGivenNameBytes() {
        return directoryUser.getGivenNameBytes();
    }

    
    public String getFamilyName() {
        return directoryUser.getFamilyName();
    }

    
    public ByteString getFamilyNameBytes() {
        return directoryUser.getFamilyNameBytes();
    }

    
    public boolean hasUpdatedAt() {
        return directoryUser.hasUpdatedAt();
    }

    
    public Timestamp getUpdatedAt() {
        return directoryUser.getUpdatedAt();
    }

    
    public TimestampOrBuilder getUpdatedAtOrBuilder() {
        return directoryUser.getUpdatedAtOrBuilder();
    }

    
    public List<String> getEmailsList() {
        return directoryUser.getEmailsList();
    }

    
    public int getEmailsCount() {
        return directoryUser.getEmailsCount();
    }

    
    public String getEmails(int index) {
        return directoryUser.getEmails(index);
    }

    
    public ByteString getEmailsBytes(int index) {
        return directoryUser.getEmailsBytes(index);
    }

    
    public List<DirectoryGroup> getGroupsList() {
        return directoryUser.getGroupsList();
    }

    
    public DirectoryGroup getGroups(int index) {
        return directoryUser.getGroups(index);
    }

    
    public int getGroupsCount() {
        return directoryUser.getGroupsCount();
    }

    
    public List<? extends DirectoryGroupOrBuilder> getGroupsOrBuilderList() {
        return directoryUser.getGroupsOrBuilderList();
    }

    
    public DirectoryGroupOrBuilder getGroupsOrBuilder(int index) {
        return directoryUser.getGroupsOrBuilder(index);
    }

    
    public boolean hasUserDetail() {
        return directoryUser.hasUserDetail();
    }

    
    public String getUserDetail() {
        return userDetails;
    }


    public StructOrBuilder getUserDetailOrBuilder() {
        return directoryUser.getUserDetailOrBuilder();
    }

    
    public Message getDefaultInstanceForType() {
        return directoryUser.getDefaultInstanceForType();
    }

    
    public boolean isInitialized() {
        return directoryUser.isInitialized();
    }

    
    public List<String> findInitializationErrors() {
        return directoryUser.findInitializationErrors();
    }

    
    public String getInitializationErrorString() {
        return directoryUser.getInitializationErrorString();
    }

    
    public Descriptors.Descriptor getDescriptorForType() {
        return directoryUser.getDescriptorForType();
    }


    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return directoryUser.getAllFields();
    }

    
    public boolean hasOneof(Descriptors.OneofDescriptor oneof) {
        return directoryUser.hasOneof(oneof);
    }

    
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneOf) {
        return directoryUser.getOneofFieldDescriptor(oneOf);
    }

    
    public boolean hasField(Descriptors.FieldDescriptor field) {
        return directoryUser.hasField(field);
    }

    
    public Object getField(Descriptors.FieldDescriptor field) {
        return directoryUser.getField(field);
    }

   
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor field) {
        return directoryUser.getRepeatedFieldCount(field);
    }

    
    public Object getRepeatedField(Descriptors.FieldDescriptor field, int index) {
        return directoryUser.getRepeatedField(field, index);
    }

    
    public UnknownFieldSet getUnknownFields() {
        return directoryUser.getUnknownFields();
    }
}

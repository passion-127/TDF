// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package com.subjectmapping;

public interface ListSubjectMappingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subjectmapping.ListSubjectMappingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  java.util.List<com.subjectmapping.SubjectMapping> 
      getSubjectMappingsList();
  /**
   * <code>repeated .subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  com.subjectmapping.SubjectMapping getSubjectMappings(int index);
  /**
   * <code>repeated .subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  int getSubjectMappingsCount();
  /**
   * <code>repeated .subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  java.util.List<? extends com.subjectmapping.SubjectMappingOrBuilder> 
      getSubjectMappingsOrBuilderList();
  /**
   * <code>repeated .subjectmapping.SubjectMapping subject_mappings = 1 [json_name = "subjectMappings"];</code>
   */
  com.subjectmapping.SubjectMappingOrBuilder getSubjectMappingsOrBuilder(
      int index);
}

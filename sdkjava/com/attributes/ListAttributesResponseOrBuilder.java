// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: attributes/attributes.proto

// Protobuf Java Version: 3.25.2
package com.attributes;

public interface ListAttributesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:attributes.ListAttributesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .attributes.Attribute attributes = 1 [json_name = "attributes"];</code>
   */
  java.util.List<com.attributes.Attribute> 
      getAttributesList();
  /**
   * <code>repeated .attributes.Attribute attributes = 1 [json_name = "attributes"];</code>
   */
  com.attributes.Attribute getAttributes(int index);
  /**
   * <code>repeated .attributes.Attribute attributes = 1 [json_name = "attributes"];</code>
   */
  int getAttributesCount();
  /**
   * <code>repeated .attributes.Attribute attributes = 1 [json_name = "attributes"];</code>
   */
  java.util.List<? extends com.attributes.AttributeOrBuilder> 
      getAttributesOrBuilderList();
  /**
   * <code>repeated .attributes.Attribute attributes = 1 [json_name = "attributes"];</code>
   */
  com.attributes.AttributeOrBuilder getAttributesOrBuilder(
      int index);
}

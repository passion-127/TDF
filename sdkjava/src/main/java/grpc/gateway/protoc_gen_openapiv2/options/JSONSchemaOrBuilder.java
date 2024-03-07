// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

// Protobuf Java Version: 3.25.3
package grpc.gateway.protoc_gen_openapiv2.options;

public interface JSONSchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gateway.protoc_gen_openapiv2.options.JSONSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Ref is used to define an external reference to include in the message.
   * This could be a fully qualified proto message reference, and that type must
   * be imported into the protofile. If no message is identified, the Ref will
   * be used verbatim in the output.
   * For example:
   *  `ref: ".google.protobuf.Timestamp"`.
   * </pre>
   *
   * <code>string ref = 3 [json_name = "ref"];</code>
   * @return The ref.
   */
  java.lang.String getRef();
  /**
   * <pre>
   * Ref is used to define an external reference to include in the message.
   * This could be a fully qualified proto message reference, and that type must
   * be imported into the protofile. If no message is identified, the Ref will
   * be used verbatim in the output.
   * For example:
   *  `ref: ".google.protobuf.Timestamp"`.
   * </pre>
   *
   * <code>string ref = 3 [json_name = "ref"];</code>
   * @return The bytes for ref.
   */
  com.google.protobuf.ByteString
      getRefBytes();

  /**
   * <pre>
   * The title of the schema.
   * </pre>
   *
   * <code>string title = 5 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title of the schema.
   * </pre>
   *
   * <code>string title = 5 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * A short description of the schema.
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A short description of the schema.
   * </pre>
   *
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string default = 7 [json_name = "default"];</code>
   * @return The default.
   */
  java.lang.String getDefault();
  /**
   * <code>string default = 7 [json_name = "default"];</code>
   * @return The bytes for default.
   */
  com.google.protobuf.ByteString
      getDefaultBytes();

  /**
   * <code>bool read_only = 8 [json_name = "readOnly"];</code>
   * @return The readOnly.
   */
  boolean getReadOnly();

  /**
   * <pre>
   * A free-form property to include a JSON example of this field. This is copied
   * verbatim to the output swagger.json. Quotes must be escaped.
   * This property is the same for 2.0 and 3.0.0 https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/3.0.0.md#schemaObject  https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#schemaObject
   * </pre>
   *
   * <code>string example = 9 [json_name = "example"];</code>
   * @return The example.
   */
  java.lang.String getExample();
  /**
   * <pre>
   * A free-form property to include a JSON example of this field. This is copied
   * verbatim to the output swagger.json. Quotes must be escaped.
   * This property is the same for 2.0 and 3.0.0 https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/3.0.0.md#schemaObject  https://github.com/OAI/OpenAPI-Specification/blob/3.0.0/versions/2.0.md#schemaObject
   * </pre>
   *
   * <code>string example = 9 [json_name = "example"];</code>
   * @return The bytes for example.
   */
  com.google.protobuf.ByteString
      getExampleBytes();

  /**
   * <code>double multiple_of = 10 [json_name = "multipleOf"];</code>
   * @return The multipleOf.
   */
  double getMultipleOf();

  /**
   * <pre>
   * Maximum represents an inclusive upper limit for a numeric instance. The
   * value of MUST be a number,
   * </pre>
   *
   * <code>double maximum = 11 [json_name = "maximum"];</code>
   * @return The maximum.
   */
  double getMaximum();

  /**
   * <code>bool exclusive_maximum = 12 [json_name = "exclusiveMaximum"];</code>
   * @return The exclusiveMaximum.
   */
  boolean getExclusiveMaximum();

  /**
   * <pre>
   * minimum represents an inclusive lower limit for a numeric instance. The
   * value of MUST be a number,
   * </pre>
   *
   * <code>double minimum = 13 [json_name = "minimum"];</code>
   * @return The minimum.
   */
  double getMinimum();

  /**
   * <code>bool exclusive_minimum = 14 [json_name = "exclusiveMinimum"];</code>
   * @return The exclusiveMinimum.
   */
  boolean getExclusiveMinimum();

  /**
   * <code>uint64 max_length = 15 [json_name = "maxLength"];</code>
   * @return The maxLength.
   */
  long getMaxLength();

  /**
   * <code>uint64 min_length = 16 [json_name = "minLength"];</code>
   * @return The minLength.
   */
  long getMinLength();

  /**
   * <code>string pattern = 17 [json_name = "pattern"];</code>
   * @return The pattern.
   */
  java.lang.String getPattern();
  /**
   * <code>string pattern = 17 [json_name = "pattern"];</code>
   * @return The bytes for pattern.
   */
  com.google.protobuf.ByteString
      getPatternBytes();

  /**
   * <code>uint64 max_items = 20 [json_name = "maxItems"];</code>
   * @return The maxItems.
   */
  long getMaxItems();

  /**
   * <code>uint64 min_items = 21 [json_name = "minItems"];</code>
   * @return The minItems.
   */
  long getMinItems();

  /**
   * <code>bool unique_items = 22 [json_name = "uniqueItems"];</code>
   * @return The uniqueItems.
   */
  boolean getUniqueItems();

  /**
   * <code>uint64 max_properties = 24 [json_name = "maxProperties"];</code>
   * @return The maxProperties.
   */
  long getMaxProperties();

  /**
   * <code>uint64 min_properties = 25 [json_name = "minProperties"];</code>
   * @return The minProperties.
   */
  long getMinProperties();

  /**
   * <code>repeated string required = 26 [json_name = "required"];</code>
   * @return A list containing the required.
   */
  java.util.List<java.lang.String>
      getRequiredList();
  /**
   * <code>repeated string required = 26 [json_name = "required"];</code>
   * @return The count of required.
   */
  int getRequiredCount();
  /**
   * <code>repeated string required = 26 [json_name = "required"];</code>
   * @param index The index of the element to return.
   * @return The required at the given index.
   */
  java.lang.String getRequired(int index);
  /**
   * <code>repeated string required = 26 [json_name = "required"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the required at the given index.
   */
  com.google.protobuf.ByteString
      getRequiredBytes(int index);

  /**
   * <pre>
   * Items in 'array' must be unique.
   * </pre>
   *
   * <code>repeated string array = 34 [json_name = "array"];</code>
   * @return A list containing the array.
   */
  java.util.List<java.lang.String>
      getArrayList();
  /**
   * <pre>
   * Items in 'array' must be unique.
   * </pre>
   *
   * <code>repeated string array = 34 [json_name = "array"];</code>
   * @return The count of array.
   */
  int getArrayCount();
  /**
   * <pre>
   * Items in 'array' must be unique.
   * </pre>
   *
   * <code>repeated string array = 34 [json_name = "array"];</code>
   * @param index The index of the element to return.
   * @return The array at the given index.
   */
  java.lang.String getArray(int index);
  /**
   * <pre>
   * Items in 'array' must be unique.
   * </pre>
   *
   * <code>repeated string array = 34 [json_name = "array"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the array at the given index.
   */
  com.google.protobuf.ByteString
      getArrayBytes(int index);

  /**
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.JSONSchemaSimpleTypes type = 35 [json_name = "type"];</code>
   * @return A list containing the type.
   */
  java.util.List<grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.JSONSchemaSimpleTypes> getTypeList();
  /**
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.JSONSchemaSimpleTypes type = 35 [json_name = "type"];</code>
   * @return The count of type.
   */
  int getTypeCount();
  /**
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.JSONSchemaSimpleTypes type = 35 [json_name = "type"];</code>
   * @param index The index of the element to return.
   * @return The type at the given index.
   */
  grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.JSONSchemaSimpleTypes getType(int index);
  /**
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.JSONSchemaSimpleTypes type = 35 [json_name = "type"];</code>
   * @return A list containing the enum numeric values on the wire for type.
   */
  java.util.List<java.lang.Integer>
  getTypeValueList();
  /**
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.JSONSchemaSimpleTypes type = 35 [json_name = "type"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of type at the given index.
   */
  int getTypeValue(int index);

  /**
   * <pre>
   * `Format`
   * </pre>
   *
   * <code>string format = 36 [json_name = "format"];</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * `Format`
   * </pre>
   *
   * <code>string format = 36 [json_name = "format"];</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   * Items in `enum` must be unique https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.5.1
   * </pre>
   *
   * <code>repeated string enum = 46 [json_name = "enum"];</code>
   * @return A list containing the enum.
   */
  java.util.List<java.lang.String>
      getEnumList();
  /**
   * <pre>
   * Items in `enum` must be unique https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.5.1
   * </pre>
   *
   * <code>repeated string enum = 46 [json_name = "enum"];</code>
   * @return The count of enum.
   */
  int getEnumCount();
  /**
   * <pre>
   * Items in `enum` must be unique https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.5.1
   * </pre>
   *
   * <code>repeated string enum = 46 [json_name = "enum"];</code>
   * @param index The index of the element to return.
   * @return The enum at the given index.
   */
  java.lang.String getEnum(int index);
  /**
   * <pre>
   * Items in `enum` must be unique https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-5.5.1
   * </pre>
   *
   * <code>repeated string enum = 46 [json_name = "enum"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the enum at the given index.
   */
  com.google.protobuf.ByteString
      getEnumBytes(int index);

  /**
   * <pre>
   * Additional field level properties used when generating the OpenAPI v2 file.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.FieldConfiguration field_configuration = 1001 [json_name = "fieldConfiguration"];</code>
   * @return Whether the fieldConfiguration field is set.
   */
  boolean hasFieldConfiguration();
  /**
   * <pre>
   * Additional field level properties used when generating the OpenAPI v2 file.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.FieldConfiguration field_configuration = 1001 [json_name = "fieldConfiguration"];</code>
   * @return The fieldConfiguration.
   */
  grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.FieldConfiguration getFieldConfiguration();
  /**
   * <pre>
   * Additional field level properties used when generating the OpenAPI v2 file.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.FieldConfiguration field_configuration = 1001 [json_name = "fieldConfiguration"];</code>
   */
  grpc.gateway.protoc_gen_openapiv2.options.JSONSchema.FieldConfigurationOrBuilder getFieldConfigurationOrBuilder();

  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 48 [json_name = "extensions"];</code>
   */
  int getExtensionsCount();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 48 [json_name = "extensions"];</code>
   */
  boolean containsExtensions(
      java.lang.String key);
  /**
   * Use {@link #getExtensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensions();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 48 [json_name = "extensions"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensionsMap();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 48 [json_name = "extensions"];</code>
   */
  /* nullable */
com.google.protobuf.Value getExtensionsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 48 [json_name = "extensions"];</code>
   */
  com.google.protobuf.Value getExtensionsOrThrow(
      java.lang.String key);
}

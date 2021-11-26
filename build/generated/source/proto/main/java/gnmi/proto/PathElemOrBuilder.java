// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gnmi/gnmi.proto

package gnmi.proto;

public interface PathElemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gnmi.PathElem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the element in the path.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the element in the path.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Map of key (attribute) name to value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */
  int getKeyCount();
  /**
   * <pre>
   * Map of key (attribute) name to value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */
  boolean containsKey(
      java.lang.String key);
  /**
   * Use {@link #getKeyMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getKey();
  /**
   * <pre>
   * Map of key (attribute) name to value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getKeyMap();
  /**
   * <pre>
   * Map of key (attribute) name to value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */

  java.lang.String getKeyOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Map of key (attribute) name to value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; key = 2;</code>
   */

  java.lang.String getKeyOrThrow(
      java.lang.String key);
}
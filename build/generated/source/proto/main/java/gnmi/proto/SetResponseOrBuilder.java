// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gnmi/gnmi.proto

package gnmi.proto;

public interface SetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gnmi.SetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Prefix used for paths.
   * </pre>
   *
   * <code>.gnmi.Path prefix = 1;</code>
   * @return Whether the prefix field is set.
   */
  boolean hasPrefix();
  /**
   * <pre>
   * Prefix used for paths.
   * </pre>
   *
   * <code>.gnmi.Path prefix = 1;</code>
   * @return The prefix.
   */
  gnmi.proto.Path getPrefix();
  /**
   * <pre>
   * Prefix used for paths.
   * </pre>
   *
   * <code>.gnmi.Path prefix = 1;</code>
   */
  gnmi.proto.PathOrBuilder getPrefixOrBuilder();

  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  java.util.List<gnmi.proto.UpdateResult> 
      getResponseList();
  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  gnmi.proto.UpdateResult getResponse(int index);
  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  int getResponseCount();
  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  java.util.List<? extends gnmi.proto.UpdateResultOrBuilder> 
      getResponseOrBuilderList();
  /**
   * <pre>
   * A set of responses specifying the result of the operations specified in
   * the SetRequest.
   * </pre>
   *
   * <code>repeated .gnmi.UpdateResult response = 2;</code>
   */
  gnmi.proto.UpdateResultOrBuilder getResponseOrBuilder(
      int index);

  /**
   * <pre>
   * The overall status of the transaction.
   * </pre>
   *
   * <code>.gnmi.Error message = 3 [deprecated = true];</code>
   * @return Whether the message field is set.
   */
  @java.lang.Deprecated boolean hasMessage();
  /**
   * <pre>
   * The overall status of the transaction.
   * </pre>
   *
   * <code>.gnmi.Error message = 3 [deprecated = true];</code>
   * @return The message.
   */
  @java.lang.Deprecated gnmi.proto.Error getMessage();
  /**
   * <pre>
   * The overall status of the transaction.
   * </pre>
   *
   * <code>.gnmi.Error message = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated gnmi.proto.ErrorOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * Timestamp of transaction (ns since epoch).
   * </pre>
   *
   * <code>int64 timestamp = 4;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  java.util.List<gnmi_ext.GnmiExt.Extension> 
      getExtensionList();
  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  gnmi_ext.GnmiExt.Extension getExtension(int index);
  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  java.util.List<? extends gnmi_ext.GnmiExt.ExtensionOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Extension messages associated with the SetResponse. See the
   * gNMI extension specification for further definition.
   * </pre>
   *
   * <code>repeated .gnmi_ext.Extension extension = 5;</code>
   */
  gnmi_ext.GnmiExt.ExtensionOrBuilder getExtensionOrBuilder(
      int index);
}

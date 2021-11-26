package gnmi.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: gnmi/gnmi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class gNMIGrpc {

  private gNMIGrpc() {}

  public static final String SERVICE_NAME = "gnmi.gNMI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gnmi.proto.CapabilityRequest,
      gnmi.proto.CapabilityResponse> getCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Capabilities",
      requestType = gnmi.proto.CapabilityRequest.class,
      responseType = gnmi.proto.CapabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gnmi.proto.CapabilityRequest,
      gnmi.proto.CapabilityResponse> getCapabilitiesMethod() {
    io.grpc.MethodDescriptor<gnmi.proto.CapabilityRequest, gnmi.proto.CapabilityResponse> getCapabilitiesMethod;
    if ((getCapabilitiesMethod = gNMIGrpc.getCapabilitiesMethod) == null) {
      synchronized (gNMIGrpc.class) {
        if ((getCapabilitiesMethod = gNMIGrpc.getCapabilitiesMethod) == null) {
          gNMIGrpc.getCapabilitiesMethod = getCapabilitiesMethod =
              io.grpc.MethodDescriptor.<gnmi.proto.CapabilityRequest, gnmi.proto.CapabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Capabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.proto.CapabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.proto.CapabilityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new gNMIMethodDescriptorSupplier("Capabilities"))
              .build();
        }
      }
    }
    return getCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gnmi.proto.GetRequest,
      gnmi.proto.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = gnmi.proto.GetRequest.class,
      responseType = gnmi.proto.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gnmi.proto.GetRequest,
      gnmi.proto.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<gnmi.proto.GetRequest, gnmi.proto.GetResponse> getGetMethod;
    if ((getGetMethod = gNMIGrpc.getGetMethod) == null) {
      synchronized (gNMIGrpc.class) {
        if ((getGetMethod = gNMIGrpc.getGetMethod) == null) {
          gNMIGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<gnmi.proto.GetRequest, gnmi.proto.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.proto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.proto.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new gNMIMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gnmi.proto.SetRequest,
      gnmi.proto.SetResponse> getSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Set",
      requestType = gnmi.proto.SetRequest.class,
      responseType = gnmi.proto.SetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gnmi.proto.SetRequest,
      gnmi.proto.SetResponse> getSetMethod() {
    io.grpc.MethodDescriptor<gnmi.proto.SetRequest, gnmi.proto.SetResponse> getSetMethod;
    if ((getSetMethod = gNMIGrpc.getSetMethod) == null) {
      synchronized (gNMIGrpc.class) {
        if ((getSetMethod = gNMIGrpc.getSetMethod) == null) {
          gNMIGrpc.getSetMethod = getSetMethod =
              io.grpc.MethodDescriptor.<gnmi.proto.SetRequest, gnmi.proto.SetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.proto.SetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.proto.SetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new gNMIMethodDescriptorSupplier("Set"))
              .build();
        }
      }
    }
    return getSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gnmi.proto.SubscribeRequest,
      gnmi.proto.SubscribeResponse> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = gnmi.proto.SubscribeRequest.class,
      responseType = gnmi.proto.SubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<gnmi.proto.SubscribeRequest,
      gnmi.proto.SubscribeResponse> getSubscribeMethod() {
    io.grpc.MethodDescriptor<gnmi.proto.SubscribeRequest, gnmi.proto.SubscribeResponse> getSubscribeMethod;
    if ((getSubscribeMethod = gNMIGrpc.getSubscribeMethod) == null) {
      synchronized (gNMIGrpc.class) {
        if ((getSubscribeMethod = gNMIGrpc.getSubscribeMethod) == null) {
          gNMIGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<gnmi.proto.SubscribeRequest, gnmi.proto.SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.proto.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.proto.SubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new gNMIMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gNMIStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<gNMIStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<gNMIStub>() {
        @java.lang.Override
        public gNMIStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new gNMIStub(channel, callOptions);
        }
      };
    return gNMIStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gNMIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<gNMIBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<gNMIBlockingStub>() {
        @java.lang.Override
        public gNMIBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new gNMIBlockingStub(channel, callOptions);
        }
      };
    return gNMIBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gNMIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<gNMIFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<gNMIFutureStub>() {
        @java.lang.Override
        public gNMIFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new gNMIFutureStub(channel, callOptions);
        }
      };
    return gNMIFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class gNMIImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Capabilities allows the client to retrieve the set of capabilities that
     * is supported by the target. This allows the target to validate the
     * service version that is implemented and retrieve the set of models that
     * the target supports. The models can then be specified in subsequent RPCs
     * to restrict the set of data that is utilized.
     * Reference: gNMI Specification Section 3.2
     * </pre>
     */
    public void capabilities(gnmi.proto.CapabilityRequest request,
        io.grpc.stub.StreamObserver<gnmi.proto.CapabilityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCapabilitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a snapshot of data from the target. A Get RPC requests that the
     * target snapshots a subset of the data tree as specified by the paths
     * included in the message and serializes this to be returned to the
     * client using the specified encoding.
     * Reference: gNMI Specification Section 3.3
     * </pre>
     */
    public void get(gnmi.proto.GetRequest request,
        io.grpc.stub.StreamObserver<gnmi.proto.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set allows the client to modify the state of data on the target. The
     * paths to modified along with the new values that the client wishes
     * to set the value to.
     * Reference: gNMI Specification Section 3.4
     * </pre>
     */
    public void set(gnmi.proto.SetRequest request,
        io.grpc.stub.StreamObserver<gnmi.proto.SetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe allows a client to request the target to send it values
     * of particular paths within the data tree. These values may be streamed
     * at a particular cadence (STREAM), sent one off on a long-lived channel
     * (POLL), or sent as a one-off retrieval (ONCE).
     * Reference: gNMI Specification Section 3.5
     * </pre>
     */
    public io.grpc.stub.StreamObserver<gnmi.proto.SubscribeRequest> subscribe(
        io.grpc.stub.StreamObserver<gnmi.proto.SubscribeResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubscribeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCapabilitiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gnmi.proto.CapabilityRequest,
                gnmi.proto.CapabilityResponse>(
                  this, METHODID_CAPABILITIES)))
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gnmi.proto.GetRequest,
                gnmi.proto.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gnmi.proto.SetRequest,
                gnmi.proto.SetResponse>(
                  this, METHODID_SET)))
          .addMethod(
            getSubscribeMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                gnmi.proto.SubscribeRequest,
                gnmi.proto.SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .build();
    }
  }

  /**
   */
  public static final class gNMIStub extends io.grpc.stub.AbstractAsyncStub<gNMIStub> {
    private gNMIStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gNMIStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new gNMIStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities allows the client to retrieve the set of capabilities that
     * is supported by the target. This allows the target to validate the
     * service version that is implemented and retrieve the set of models that
     * the target supports. The models can then be specified in subsequent RPCs
     * to restrict the set of data that is utilized.
     * Reference: gNMI Specification Section 3.2
     * </pre>
     */
    public void capabilities(gnmi.proto.CapabilityRequest request,
        io.grpc.stub.StreamObserver<gnmi.proto.CapabilityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a snapshot of data from the target. A Get RPC requests that the
     * target snapshots a subset of the data tree as specified by the paths
     * included in the message and serializes this to be returned to the
     * client using the specified encoding.
     * Reference: gNMI Specification Section 3.3
     * </pre>
     */
    public void get(gnmi.proto.GetRequest request,
        io.grpc.stub.StreamObserver<gnmi.proto.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set allows the client to modify the state of data on the target. The
     * paths to modified along with the new values that the client wishes
     * to set the value to.
     * Reference: gNMI Specification Section 3.4
     * </pre>
     */
    public void set(gnmi.proto.SetRequest request,
        io.grpc.stub.StreamObserver<gnmi.proto.SetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe allows a client to request the target to send it values
     * of particular paths within the data tree. These values may be streamed
     * at a particular cadence (STREAM), sent one off on a long-lived channel
     * (POLL), or sent as a one-off retrieval (ONCE).
     * Reference: gNMI Specification Section 3.5
     * </pre>
     */
    public io.grpc.stub.StreamObserver<gnmi.proto.SubscribeRequest> subscribe(
        io.grpc.stub.StreamObserver<gnmi.proto.SubscribeResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class gNMIBlockingStub extends io.grpc.stub.AbstractBlockingStub<gNMIBlockingStub> {
    private gNMIBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gNMIBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new gNMIBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities allows the client to retrieve the set of capabilities that
     * is supported by the target. This allows the target to validate the
     * service version that is implemented and retrieve the set of models that
     * the target supports. The models can then be specified in subsequent RPCs
     * to restrict the set of data that is utilized.
     * Reference: gNMI Specification Section 3.2
     * </pre>
     */
    public gnmi.proto.CapabilityResponse capabilities(gnmi.proto.CapabilityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a snapshot of data from the target. A Get RPC requests that the
     * target snapshots a subset of the data tree as specified by the paths
     * included in the message and serializes this to be returned to the
     * client using the specified encoding.
     * Reference: gNMI Specification Section 3.3
     * </pre>
     */
    public gnmi.proto.GetResponse get(gnmi.proto.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set allows the client to modify the state of data on the target. The
     * paths to modified along with the new values that the client wishes
     * to set the value to.
     * Reference: gNMI Specification Section 3.4
     * </pre>
     */
    public gnmi.proto.SetResponse set(gnmi.proto.SetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gNMIFutureStub extends io.grpc.stub.AbstractFutureStub<gNMIFutureStub> {
    private gNMIFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gNMIFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new gNMIFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Capabilities allows the client to retrieve the set of capabilities that
     * is supported by the target. This allows the target to validate the
     * service version that is implemented and retrieve the set of models that
     * the target supports. The models can then be specified in subsequent RPCs
     * to restrict the set of data that is utilized.
     * Reference: gNMI Specification Section 3.2
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gnmi.proto.CapabilityResponse> capabilities(
        gnmi.proto.CapabilityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a snapshot of data from the target. A Get RPC requests that the
     * target snapshots a subset of the data tree as specified by the paths
     * included in the message and serializes this to be returned to the
     * client using the specified encoding.
     * Reference: gNMI Specification Section 3.3
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gnmi.proto.GetResponse> get(
        gnmi.proto.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set allows the client to modify the state of data on the target. The
     * paths to modified along with the new values that the client wishes
     * to set the value to.
     * Reference: gNMI Specification Section 3.4
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gnmi.proto.SetResponse> set(
        gnmi.proto.SetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CAPABILITIES = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_SET = 2;
  private static final int METHODID_SUBSCRIBE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gNMIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gNMIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CAPABILITIES:
          serviceImpl.capabilities((gnmi.proto.CapabilityRequest) request,
              (io.grpc.stub.StreamObserver<gnmi.proto.CapabilityResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((gnmi.proto.GetRequest) request,
              (io.grpc.stub.StreamObserver<gnmi.proto.GetResponse>) responseObserver);
          break;
        case METHODID_SET:
          serviceImpl.set((gnmi.proto.SetRequest) request,
              (io.grpc.stub.StreamObserver<gnmi.proto.SetResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribe(
              (io.grpc.stub.StreamObserver<gnmi.proto.SubscribeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class gNMIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gNMIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gnmi.proto.GnmiProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gNMI");
    }
  }

  private static final class gNMIFileDescriptorSupplier
      extends gNMIBaseDescriptorSupplier {
    gNMIFileDescriptorSupplier() {}
  }

  private static final class gNMIMethodDescriptorSupplier
      extends gNMIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gNMIMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (gNMIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gNMIFileDescriptorSupplier())
              .addMethod(getCapabilitiesMethod())
              .addMethod(getGetMethod())
              .addMethod(getSetMethod())
              .addMethod(getSubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}

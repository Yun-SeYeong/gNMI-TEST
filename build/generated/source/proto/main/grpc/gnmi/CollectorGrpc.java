package gnmi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: collector/collector.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CollectorGrpc {

  private CollectorGrpc() {}

  public static final String SERVICE_NAME = "gnmi.Collector";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gnmi.CollectorOuterClass.ReconnectRequest,
      gnmi.CollectorOuterClass.Nil> getReconnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reconnect",
      requestType = gnmi.CollectorOuterClass.ReconnectRequest.class,
      responseType = gnmi.CollectorOuterClass.Nil.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gnmi.CollectorOuterClass.ReconnectRequest,
      gnmi.CollectorOuterClass.Nil> getReconnectMethod() {
    io.grpc.MethodDescriptor<gnmi.CollectorOuterClass.ReconnectRequest, gnmi.CollectorOuterClass.Nil> getReconnectMethod;
    if ((getReconnectMethod = CollectorGrpc.getReconnectMethod) == null) {
      synchronized (CollectorGrpc.class) {
        if ((getReconnectMethod = CollectorGrpc.getReconnectMethod) == null) {
          CollectorGrpc.getReconnectMethod = getReconnectMethod =
              io.grpc.MethodDescriptor.<gnmi.CollectorOuterClass.ReconnectRequest, gnmi.CollectorOuterClass.Nil>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reconnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.CollectorOuterClass.ReconnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gnmi.CollectorOuterClass.Nil.getDefaultInstance()))
              .setSchemaDescriptor(new CollectorMethodDescriptorSupplier("Reconnect"))
              .build();
        }
      }
    }
    return getReconnectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CollectorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectorStub>() {
        @java.lang.Override
        public CollectorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectorStub(channel, callOptions);
        }
      };
    return CollectorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CollectorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectorBlockingStub>() {
        @java.lang.Override
        public CollectorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectorBlockingStub(channel, callOptions);
        }
      };
    return CollectorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CollectorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CollectorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CollectorFutureStub>() {
        @java.lang.Override
        public CollectorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CollectorFutureStub(channel, callOptions);
        }
      };
    return CollectorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CollectorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Reconnect requests that the existing connections for one or more specified
     * targets will be stopped and new connections established.
     * </pre>
     */
    public void reconnect(gnmi.CollectorOuterClass.ReconnectRequest request,
        io.grpc.stub.StreamObserver<gnmi.CollectorOuterClass.Nil> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReconnectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReconnectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                gnmi.CollectorOuterClass.ReconnectRequest,
                gnmi.CollectorOuterClass.Nil>(
                  this, METHODID_RECONNECT)))
          .build();
    }
  }

  /**
   */
  public static final class CollectorStub extends io.grpc.stub.AbstractAsyncStub<CollectorStub> {
    private CollectorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectorStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reconnect requests that the existing connections for one or more specified
     * targets will be stopped and new connections established.
     * </pre>
     */
    public void reconnect(gnmi.CollectorOuterClass.ReconnectRequest request,
        io.grpc.stub.StreamObserver<gnmi.CollectorOuterClass.Nil> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReconnectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CollectorBlockingStub extends io.grpc.stub.AbstractBlockingStub<CollectorBlockingStub> {
    private CollectorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectorBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reconnect requests that the existing connections for one or more specified
     * targets will be stopped and new connections established.
     * </pre>
     */
    public gnmi.CollectorOuterClass.Nil reconnect(gnmi.CollectorOuterClass.ReconnectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReconnectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CollectorFutureStub extends io.grpc.stub.AbstractFutureStub<CollectorFutureStub> {
    private CollectorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CollectorFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Reconnect requests that the existing connections for one or more specified
     * targets will be stopped and new connections established.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gnmi.CollectorOuterClass.Nil> reconnect(
        gnmi.CollectorOuterClass.ReconnectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReconnectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECONNECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CollectorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CollectorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECONNECT:
          serviceImpl.reconnect((gnmi.CollectorOuterClass.ReconnectRequest) request,
              (io.grpc.stub.StreamObserver<gnmi.CollectorOuterClass.Nil>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CollectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CollectorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gnmi.CollectorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Collector");
    }
  }

  private static final class CollectorFileDescriptorSupplier
      extends CollectorBaseDescriptorSupplier {
    CollectorFileDescriptorSupplier() {}
  }

  private static final class CollectorMethodDescriptorSupplier
      extends CollectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CollectorMethodDescriptorSupplier(String methodName) {
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
      synchronized (CollectorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CollectorFileDescriptorSupplier())
              .addMethod(getReconnectMethod())
              .build();
        }
      }
    }
    return result;
  }
}

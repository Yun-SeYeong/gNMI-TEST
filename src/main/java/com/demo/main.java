package com.demo;

import gnmi.proto.GetRequest;
import gnmi.proto.GetResponse;
import gnmi.proto.Path;
import gnmi.proto.PathElem;
import gnmi.proto.gNMIGrpc;
import gnmi.proto.gNMIGrpc.gNMIBlockingStub;
import io.grpc.Channel;
import io.grpc.Metadata;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.MetadataUtils;

public class main {
    public static void main(String[] args) {
        String host = "192.168.100.162:5901";
        String username = "admin";
        String password = "admin";

        if (args.length > 0 && !args[0].equals("")){
            host = args[0];
        }

        if (args.length > 1 && !args[1].equals("")){
            username = args[1];
        }

        if (args.length > 2 && !args[2].equals("")){
            password = args[2];
        }

        GetRequest getRequest = GetRequest.newBuilder()
                .addPath(Path.newBuilder()
                        .setOrigin("openconfig")
                        .addElem(
                                PathElem.newBuilder()
                                        .setName("interfaces")
                                        .build()
                        )
                        .addElem(
                                PathElem.newBuilder()
                                        .setName("interface")
                                        .putKey("name", "Ethernet2")
                                        .build()
                        )
                        .build())
                .build();

      System.out.println("getRequest = " + getRequest);

      Channel channel = NettyChannelBuilder
          .forTarget(host)
          .usePlaintext()
          .build();

      Metadata headers = new Metadata();
      headers.put(Metadata.Key.of("username", Metadata.ASCII_STRING_MARSHALLER), username);
      headers.put(Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER), password);

      gNMIBlockingStub gNMIStub = MetadataUtils.attachHeaders(gNMIGrpc.newBlockingStub(channel), headers);

      GetResponse getResponse = gNMIStub.get(getRequest);

      System.out.println("getResponse = " + getResponse.getNotificationList().get(0).getUpdateList().get(0).getVal().getJsonIetfVal().toStringUtf8());
    }
}

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
        GetRequest getRequest = GetRequest.newBuilder()
            .setPrefix(Path
                .newBuilder()
                .setTarget("192.168.100.172:5901"))
            .addPath(Path.newBuilder()
                .addElement("interfaces")
                .addElement("interface[name=Ethernet2]")
                .addElement("state")
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
                .addElem(
                    PathElem.newBuilder()
                        .setName("state")
                        .build()
                )
                .build())
            .build();

      System.out.println("getRequest = " + getRequest);

      Channel channel = NettyChannelBuilder
          .forTarget("192.168.100.172:5901")
          .usePlaintext()
          .build();

      Metadata headers = new Metadata();
      headers.put(Metadata.Key.of("username", Metadata.ASCII_STRING_MARSHALLER), "admin");
      headers.put(Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER), "admin");

      gNMIBlockingStub gNMIStub = MetadataUtils.attachHeaders(gNMIGrpc.newBlockingStub(channel), headers);

      GetResponse getResponse = gNMIStub.get(getRequest);

      System.out.println("getResponse = " + getResponse.getNotificationList().get(0).getUpdateList().get(0).getVal().getJsonIetfVal().toStringUtf8());
    }
}

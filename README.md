# gNMI





### gNMI란?

- Configuration을 다루고, state를 읽어올 수 있는 프로토콜
  - gNMI를 통에 데이터를 다룰때 name들과 map<stirng,string> 로 구성된 path를 구성할 수 있어야한다.
  - 꼭 YANG-model일 필요는 없다.
- gRPC를 바탕으로 개발되었다. google에 의해 개발된 오프소스이고 CNCF에서 관리하고 있다.
  - RPC는 HTTP/2로 만들어져있다.
  - 서버 스트리밍, 클라이언트 스트리밍, 양방향 스트리밍





### gNMI를 사용하는 이유

> 플랫폼 개발에 있어서 CLI와 같은 구조화 되지 않은 방법은 핸들링이나 관리에 있어서 어려움이 많다.

- CLI는 프로그래밍을 할 수 없다.
  - 트렌젝션 관리가 어렵다.
  - 구조화 되지않아 error 핸들링이 어렵다.
  - 구조나 커맨드 문법이 바뀐다.
- gNMI vs Openflow
  - Openflow -> Forwarding Plane
    - Packet A goes to X
  - gNMI -> Platform
    - Configuration
    - Hardware/Software
    - Environmental/Power





### gNMI 구성

> gRPC, gNMI, Tree-structured data 로 구성된다.

- gRPC - transport
  - High 퍼포먼스의 RPC framework로 어떤 환경에서도 실행할 수 있다.
- gNMI - action
  - Get/Set/Subscribe/Capabilities (proto 파일을 통해 서비스를 정의한다)
- Tree-structured data - properties
  - OpenConfig - YANG data models





### gNMI - 서비스 정의

```protobuf
service gNMI {
 rpc Capabilities(CapabilityRequest) returns (CapabilityResponse);
 rpc Get(GetRequest) returns (GetResponse);
 rpc Set(SetRequest) returns (SetResponse);
 rpc Subscribe(stream SubscribeRequest) returns (stream SubscribeResponse);
}
```




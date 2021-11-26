//
// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.26.0
// 	protoc        v3.12.4
// source: github.com/openconfig/gnmi/proto/target/target.proto

// Package target contains messages for defining a configuration of a caching
// collector to connect to multiple gNMI targets.

package target

import (
	gnmi "github.com/openconfig/gnmi/proto/gnmi"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// Configuration holds all information necessary for a caching gNMI collector
// to establish subscriptions to a list of gNMI targets.
type Configuration struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Request is a keyed list of all SubscriptionRequests that can be sent
	// to targets in the Configuration.
	// The request must have at minimum a SubscriptionList with a prefix
	// containing origin and one or more Subscriptions.  Only the STREAM mode is
	// supported.
	Request map[string]*gnmi.SubscribeRequest `protobuf:"bytes,1,rep,name=request,proto3" json:"request,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	// Target is the full list of targets connected to by a caching gNMI
	// collector.  The key of the map is a unique name to identify a target and
	// is set in the prefix.target of a SubscriptionRequest message when
	// connecting to each respective target.
	Target map[string]*Target `protobuf:"bytes,2,rep,name=target,proto3" json:"target,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	// Identifier for the caching collector.
	InstanceId string `protobuf:"bytes,3,opt,name=instance_id,json=instanceId,proto3" json:"instance_id,omitempty"`
	// Revision for this Configuration. Systems that non-atomically write
	// configuration should populate and require revision, leveraging canonical
	// protobuf serialization of fields in order. Presence of this field makes no
	// guarantee. Consumers should account for atomicity constraints of their
	// environment and any custom encoding.
	Revision int64 `protobuf:"varint,536870911,opt,name=revision,proto3" json:"revision,omitempty"`
}

func (x *Configuration) Reset() {
	*x = Configuration{}
	if protoimpl.UnsafeEnabled {
		mi := &file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Configuration) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Configuration) ProtoMessage() {}

func (x *Configuration) ProtoReflect() protoreflect.Message {
	mi := &file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Configuration.ProtoReflect.Descriptor instead.
func (*Configuration) Descriptor() ([]byte, []int) {
	return file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescGZIP(), []int{0}
}

func (x *Configuration) GetRequest() map[string]*gnmi.SubscribeRequest {
	if x != nil {
		return x.Request
	}
	return nil
}

func (x *Configuration) GetTarget() map[string]*Target {
	if x != nil {
		return x.Target
	}
	return nil
}

func (x *Configuration) GetInstanceId() string {
	if x != nil {
		return x.InstanceId
	}
	return ""
}

func (x *Configuration) GetRevision() int64 {
	if x != nil {
		return x.Revision
	}
	return 0
}

// Target is the information necessary to establish a single gNMI Subscribe RPC
// to be collected and cached.
type Target struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// A list of address and port or name that resolves to an address and port.
	Addresses []string `protobuf:"bytes,1,rep,name=addresses,proto3" json:"addresses,omitempty"`
	// Credentials to use in metadata for authorization of the RPC
	Credentials *Credentials `protobuf:"bytes,2,opt,name=credentials,proto3" json:"credentials,omitempty"`
	// The request to be sent to the target. The string supplied is looked up in
	// the request map of the Configuration message.
	Request string `protobuf:"bytes,3,opt,name=request,proto3" json:"request,omitempty"`
	// Additional target metadata.
	Meta map[string]string `protobuf:"bytes,4,rep,name=meta,proto3" json:"meta,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	// How should the target be dialed. This option allows for a custom
	// implementation for how this target is to be reached. If unset the
	// collector's default implementation will be used.
	Dialer string `protobuf:"bytes,5,opt,name=dialer,proto3" json:"dialer,omitempty"`
}

func (x *Target) Reset() {
	*x = Target{}
	if protoimpl.UnsafeEnabled {
		mi := &file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Target) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Target) ProtoMessage() {}

func (x *Target) ProtoReflect() protoreflect.Message {
	mi := &file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Target.ProtoReflect.Descriptor instead.
func (*Target) Descriptor() ([]byte, []int) {
	return file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescGZIP(), []int{1}
}

func (x *Target) GetAddresses() []string {
	if x != nil {
		return x.Addresses
	}
	return nil
}

func (x *Target) GetCredentials() *Credentials {
	if x != nil {
		return x.Credentials
	}
	return nil
}

func (x *Target) GetRequest() string {
	if x != nil {
		return x.Request
	}
	return ""
}

func (x *Target) GetMeta() map[string]string {
	if x != nil {
		return x.Meta
	}
	return nil
}

func (x *Target) GetDialer() string {
	if x != nil {
		return x.Dialer
	}
	return ""
}

// Credentials contains the fields necessary for authentication of the client to
// the target.
type Credentials struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Username string `protobuf:"bytes,1,opt,name=username,proto3" json:"username,omitempty"`
	Password string `protobuf:"bytes,2,opt,name=password,proto3" json:"password,omitempty"`
	// Password lookup ID.
	PasswordId string `protobuf:"bytes,3,opt,name=password_id,json=passwordId,proto3" json:"password_id,omitempty"`
}

func (x *Credentials) Reset() {
	*x = Credentials{}
	if protoimpl.UnsafeEnabled {
		mi := &file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Credentials) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Credentials) ProtoMessage() {}

func (x *Credentials) ProtoReflect() protoreflect.Message {
	mi := &file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Credentials.ProtoReflect.Descriptor instead.
func (*Credentials) Descriptor() ([]byte, []int) {
	return file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescGZIP(), []int{2}
}

func (x *Credentials) GetUsername() string {
	if x != nil {
		return x.Username
	}
	return ""
}

func (x *Credentials) GetPassword() string {
	if x != nil {
		return x.Password
	}
	return ""
}

func (x *Credentials) GetPasswordId() string {
	if x != nil {
		return x.PasswordId
	}
	return ""
}

var File_github_com_openconfig_gnmi_proto_target_target_proto protoreflect.FileDescriptor

var file_github_com_openconfig_gnmi_proto_target_target_proto_rawDesc = []byte{
	0x0a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x65,
	0x6e, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x67, 0x6e, 0x6d, 0x69, 0x2f, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x2f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x06, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x1a, 0x30,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x67, 0x6e, 0x6d, 0x69, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x67, 0x6e, 0x6d, 0x69, 0x2f, 0x67, 0x6e, 0x6d, 0x69, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xe8, 0x02, 0x0a, 0x0d, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x75, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x12, 0x3c, 0x0a, 0x07, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x22, 0x2e, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x2e, 0x43, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x07, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x39, 0x0a, 0x06, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x21, 0x2e, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x2e, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x75, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x45, 0x6e,
	0x74, 0x72, 0x79, 0x52, 0x06, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x1f, 0x0a, 0x0b, 0x69,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0a, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x49, 0x64, 0x12, 0x1e, 0x0a, 0x08,
	0x72, 0x65, 0x76, 0x69, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0xff, 0xff, 0xff, 0xff, 0x01, 0x20, 0x01,
	0x28, 0x03, 0x52, 0x08, 0x72, 0x65, 0x76, 0x69, 0x73, 0x69, 0x6f, 0x6e, 0x1a, 0x52, 0x0a, 0x0c,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03,
	0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x2c,
	0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e,
	0x67, 0x6e, 0x6d, 0x69, 0x2e, 0x53, 0x75, 0x62, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01,
	0x1a, 0x49, 0x0a, 0x0b, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12,
	0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65,
	0x79, 0x12, 0x24, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x0e, 0x2e, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x2e, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74,
	0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x22, 0xf6, 0x01, 0x0a, 0x06,
	0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x1c, 0x0a, 0x09, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73,
	0x73, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x52, 0x09, 0x61, 0x64, 0x64, 0x72, 0x65,
	0x73, 0x73, 0x65, 0x73, 0x12, 0x35, 0x0a, 0x0b, 0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69,
	0x61, 0x6c, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x74, 0x61, 0x72, 0x67,
	0x65, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x52, 0x0b,
	0x63, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x61, 0x6c, 0x73, 0x12, 0x18, 0x0a, 0x07, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x2c, 0x0a, 0x04, 0x6d, 0x65, 0x74, 0x61, 0x18, 0x04, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x2e, 0x54, 0x61, 0x72,
	0x67, 0x65, 0x74, 0x2e, 0x4d, 0x65, 0x74, 0x61, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x04, 0x6d,
	0x65, 0x74, 0x61, 0x12, 0x16, 0x0a, 0x06, 0x64, 0x69, 0x61, 0x6c, 0x65, 0x72, 0x18, 0x05, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x06, 0x64, 0x69, 0x61, 0x6c, 0x65, 0x72, 0x1a, 0x37, 0x0a, 0x09, 0x4d,
	0x65, 0x74, 0x61, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61,
	0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65,
	0x3a, 0x02, 0x38, 0x01, 0x22, 0x66, 0x0a, 0x0b, 0x43, 0x72, 0x65, 0x64, 0x65, 0x6e, 0x74, 0x69,
	0x61, 0x6c, 0x73, 0x12, 0x1a, 0x0a, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x12,
	0x1a, 0x0a, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x12, 0x1f, 0x0a, 0x0b, 0x70,
	0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0a, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x49, 0x64, 0x42, 0x29, 0x5a, 0x27,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x63,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2f, 0x67, 0x6e, 0x6d, 0x69, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescOnce sync.Once
	file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescData = file_github_com_openconfig_gnmi_proto_target_target_proto_rawDesc
)

func file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescGZIP() []byte {
	file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescOnce.Do(func() {
		file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescData = protoimpl.X.CompressGZIP(file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescData)
	})
	return file_github_com_openconfig_gnmi_proto_target_target_proto_rawDescData
}

var file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_github_com_openconfig_gnmi_proto_target_target_proto_goTypes = []interface{}{
	(*Configuration)(nil),         // 0: target.Configuration
	(*Target)(nil),                // 1: target.Target
	(*Credentials)(nil),           // 2: target.Credentials
	nil,                           // 3: target.Configuration.RequestEntry
	nil,                           // 4: target.Configuration.TargetEntry
	nil,                           // 5: target.Target.MetaEntry
	(*gnmi.SubscribeRequest)(nil), // 6: gnmi.SubscribeRequest
}
var file_github_com_openconfig_gnmi_proto_target_target_proto_depIdxs = []int32{
	3, // 0: target.Configuration.request:type_name -> target.Configuration.RequestEntry
	4, // 1: target.Configuration.target:type_name -> target.Configuration.TargetEntry
	2, // 2: target.Target.credentials:type_name -> target.Credentials
	5, // 3: target.Target.meta:type_name -> target.Target.MetaEntry
	6, // 4: target.Configuration.RequestEntry.value:type_name -> gnmi.SubscribeRequest
	1, // 5: target.Configuration.TargetEntry.value:type_name -> target.Target
	6, // [6:6] is the sub-list for method output_type
	6, // [6:6] is the sub-list for method input_type
	6, // [6:6] is the sub-list for extension type_name
	6, // [6:6] is the sub-list for extension extendee
	0, // [0:6] is the sub-list for field type_name
}

func init() { file_github_com_openconfig_gnmi_proto_target_target_proto_init() }
func file_github_com_openconfig_gnmi_proto_target_target_proto_init() {
	if File_github_com_openconfig_gnmi_proto_target_target_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Configuration); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Target); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Credentials); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_github_com_openconfig_gnmi_proto_target_target_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_github_com_openconfig_gnmi_proto_target_target_proto_goTypes,
		DependencyIndexes: file_github_com_openconfig_gnmi_proto_target_target_proto_depIdxs,
		MessageInfos:      file_github_com_openconfig_gnmi_proto_target_target_proto_msgTypes,
	}.Build()
	File_github_com_openconfig_gnmi_proto_target_target_proto = out.File
	file_github_com_openconfig_gnmi_proto_target_target_proto_rawDesc = nil
	file_github_com_openconfig_gnmi_proto_target_target_proto_goTypes = nil
	file_github_com_openconfig_gnmi_proto_target_target_proto_depIdxs = nil
}

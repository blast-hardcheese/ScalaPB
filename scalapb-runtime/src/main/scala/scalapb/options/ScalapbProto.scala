// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

object ScalapbProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.google.protobuf.descriptor.DescriptorProtoCompanion
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      scalapb.options.ScalaPbOptions,
      scalapb.options.MessageOptions,
      scalapb.options.Collection,
      scalapb.options.FieldOptions,
      scalapb.options.EnumOptions,
      scalapb.options.EnumValueOptions,
      scalapb.options.OneofOptions,
      scalapb.options.FieldTransformation,
      scalapb.options.PreprocessorOutput
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """ChVzY2FsYXBiL3NjYWxhcGIucHJvdG8SB3NjYWxhcGIaIGdvb2dsZS9wcm90b2J1Zi9kZXNjcmlwdG9yLnByb3RvIvsUCg5TY
  2FsYVBiT3B0aW9ucxIzCgxwYWNrYWdlX25hbWUYASABKAlCEOI/DRILcGFja2FnZU5hbWVSC3BhY2thZ2VOYW1lEjMKDGZsYXRfc
  GFja2FnZRgCIAEoCEIQ4j8NEgtmbGF0UGFja2FnZVILZmxhdFBhY2thZ2USIwoGaW1wb3J0GAMgAygJQgviPwgSBmltcG9ydFIGa
  W1wb3J0EikKCHByZWFtYmxlGAQgAygJQg3iPwoSCHByZWFtYmxlUghwcmVhbWJsZRIwCgtzaW5nbGVfZmlsZRgFIAEoCEIP4j8ME
  gpzaW5nbGVGaWxlUgpzaW5nbGVGaWxlEkwKFW5vX3ByaW1pdGl2ZV93cmFwcGVycxgHIAEoCEIY4j8VEhNub1ByaW1pdGl2ZVdyY
  XBwZXJzUhNub1ByaW1pdGl2ZVdyYXBwZXJzEkUKEnByaW1pdGl2ZV93cmFwcGVycxgGIAEoCEIW4j8TEhFwcmltaXRpdmVXcmFwc
  GVyc1IRcHJpbWl0aXZlV3JhcHBlcnMSPAoPY29sbGVjdGlvbl90eXBlGAggASgJQhPiPxASDmNvbGxlY3Rpb25UeXBlUg5jb2xsZ
  WN0aW9uVHlwZRJYChdwcmVzZXJ2ZV91bmtub3duX2ZpZWxkcxgJIAEoCDoEdHJ1ZUIa4j8XEhVwcmVzZXJ2ZVVua25vd25GaWVsZ
  HNSFXByZXNlcnZlVW5rbm93bkZpZWxkcxIwCgtvYmplY3RfbmFtZRgKIAEoCUIP4j8MEgpvYmplY3ROYW1lUgpvYmplY3ROYW1lE
  kYKBXNjb3BlGAsgASgOMiQuc2NhbGFwYi5TY2FsYVBiT3B0aW9ucy5PcHRpb25zU2NvcGVCCuI/BxIFc2NvcGVSBXNjb3BlEikKB
  mxlbnNlcxgMIAEoCDoEdHJ1ZUIL4j8IEgZsZW5zZXNSBmxlbnNlcxJQChdyZXRhaW5fc291cmNlX2NvZGVfaW5mbxgNIAEoCEIZ4
  j8WEhRyZXRhaW5Tb3VyY2VDb2RlSW5mb1IUcmV0YWluU291cmNlQ29kZUluZm8SJwoIbWFwX3R5cGUYDiABKAlCDOI/CRIHbWFwV
  HlwZVIHbWFwVHlwZRJpCiBub19kZWZhdWx0X3ZhbHVlc19pbl9jb25zdHJ1Y3RvchgPIAEoCEIh4j8eEhxub0RlZmF1bHRWYWx1Z
  XNJbkNvbnN0cnVjdG9yUhxub0RlZmF1bHRWYWx1ZXNJbkNvbnN0cnVjdG9yEmkKEWVudW1fdmFsdWVfbmFtaW5nGBAgASgOMicuc
  2NhbGFwYi5TY2FsYVBiT3B0aW9ucy5FbnVtVmFsdWVOYW1pbmdCFOI/ERIPZW51bVZhbHVlTmFtaW5nUg9lbnVtVmFsdWVOYW1pb
  mcSRwoRZW51bV9zdHJpcF9wcmVmaXgYESABKAg6BWZhbHNlQhTiPxESD2VudW1TdHJpcFByZWZpeFIPZW51bVN0cmlwUHJlZml4E
  i0KCmJ5dGVzX3R5cGUYFSABKAlCDuI/CxIJYnl0ZXNUeXBlUglieXRlc1R5cGUSPwoQamF2YV9jb252ZXJzaW9ucxgXIAEoCEIU4
  j8REg9qYXZhQ29udmVyc2lvbnNSD2phdmFDb252ZXJzaW9ucxJxChNhdXhfbWVzc2FnZV9vcHRpb25zGBIgAygLMikuc2NhbGFwY
  i5TY2FsYVBiT3B0aW9ucy5BdXhNZXNzYWdlT3B0aW9uc0IW4j8TEhFhdXhNZXNzYWdlT3B0aW9uc1IRYXV4TWVzc2FnZU9wdGlvb
  nMSaQoRYXV4X2ZpZWxkX29wdGlvbnMYEyADKAsyJy5zY2FsYXBiLlNjYWxhUGJPcHRpb25zLkF1eEZpZWxkT3B0aW9uc0IU4j8RE
  g9hdXhGaWVsZE9wdGlvbnNSD2F1eEZpZWxkT3B0aW9ucxJlChBhdXhfZW51bV9vcHRpb25zGBQgAygLMiYuc2NhbGFwYi5TY2FsY
  VBiT3B0aW9ucy5BdXhFbnVtT3B0aW9uc0IT4j8QEg5hdXhFbnVtT3B0aW9uc1IOYXV4RW51bU9wdGlvbnMSegoWYXV4X2VudW1fd
  mFsdWVfb3B0aW9ucxgWIAMoCzIrLnNjYWxhcGIuU2NhbGFQYk9wdGlvbnMuQXV4RW51bVZhbHVlT3B0aW9uc0IY4j8VEhNhdXhFb
  nVtVmFsdWVPcHRpb25zUhNhdXhFbnVtVmFsdWVPcHRpb25zEjgKDXByZXByb2Nlc3NvcnMYGCADKAlCEuI/DxINcHJlcHJvY2Vzc
  29yc1INcHJlcHJvY2Vzc29ycxJsChVmaWVsZF90cmFuc2Zvcm1hdGlvbnMYGSADKAsyHC5zY2FsYXBiLkZpZWxkVHJhbnNmb3JtY
  XRpb25CGeI/FhIUZmllbGRUcmFuc2Zvcm1hdGlvbnNSFGZpZWxkVHJhbnNmb3JtYXRpb25zElsKGmlnbm9yZV9hbGxfdHJhbnNmb
  3JtYXRpb25zGBogASgIQh3iPxoSGGlnbm9yZUFsbFRyYW5zZm9ybWF0aW9uc1IYaWdub3JlQWxsVHJhbnNmb3JtYXRpb25zEiwKB
  2dldHRlcnMYGyABKAg6BHRydWVCDOI/CRIHZ2V0dGVyc1IHZ2V0dGVycxJhCh10ZXN0X29ubHlfbm9famF2YV9jb252ZXJzaW9uc
  xjnByABKAhCHuI/GxIZdGVzdE9ubHlOb0phdmFDb252ZXJzaW9uc1IZdGVzdE9ubHlOb0phdmFDb252ZXJzaW9ucxp5ChFBdXhNZ
  XNzYWdlT3B0aW9ucxIjCgZ0YXJnZXQYASABKAlCC+I/CBIGdGFyZ2V0UgZ0YXJnZXQSPwoHb3B0aW9ucxgCIAEoCzIXLnNjYWxhc
  GIuTWVzc2FnZU9wdGlvbnNCDOI/CRIHb3B0aW9uc1IHb3B0aW9ucxp1Cg9BdXhGaWVsZE9wdGlvbnMSIwoGdGFyZ2V0GAEgASgJQ
  gviPwgSBnRhcmdldFIGdGFyZ2V0Ej0KB29wdGlvbnMYAiABKAsyFS5zY2FsYXBiLkZpZWxkT3B0aW9uc0IM4j8JEgdvcHRpb25zU
  gdvcHRpb25zGnMKDkF1eEVudW1PcHRpb25zEiMKBnRhcmdldBgBIAEoCUIL4j8IEgZ0YXJnZXRSBnRhcmdldBI8CgdvcHRpb25zG
  AIgASgLMhQuc2NhbGFwYi5FbnVtT3B0aW9uc0IM4j8JEgdvcHRpb25zUgdvcHRpb25zGn0KE0F1eEVudW1WYWx1ZU9wdGlvbnMSI
  woGdGFyZ2V0GAEgASgJQgviPwgSBnRhcmdldFIGdGFyZ2V0EkEKB29wdGlvbnMYAiABKAsyGS5zY2FsYXBiLkVudW1WYWx1ZU9wd
  GlvbnNCDOI/CRIHb3B0aW9uc1IHb3B0aW9ucyIlCgxPcHRpb25zU2NvcGUSCAoERklMRRAAEgsKB1BBQ0tBR0UQASIyCg9FbnVtV
  mFsdWVOYW1pbmcSDwoLQVNfSU5fUFJPVE8QABIOCgpDQU1FTF9DQVNFEAEqCQjoBxCAgICAAiL1AwoOTWVzc2FnZU9wdGlvbnMSJ
  goHZXh0ZW5kcxgBIAMoCUIM4j8JEgdleHRlbmRzUgdleHRlbmRzEkIKEWNvbXBhbmlvbl9leHRlbmRzGAIgAygJQhXiPxISEGNvb
  XBhbmlvbkV4dGVuZHNSEGNvbXBhbmlvbkV4dGVuZHMSMgoLYW5ub3RhdGlvbnMYAyADKAlCEOI/DRILYW5ub3RhdGlvbnNSC2Fub
  m90YXRpb25zEh0KBHR5cGUYBCABKAlCCeI/BhIEdHlwZVIEdHlwZRJOChVjb21wYW5pb25fYW5ub3RhdGlvbnMYBSADKAlCGeI/F
  hIUY29tcGFuaW9uQW5ub3RhdGlvbnNSFGNvbXBhbmlvbkFubm90YXRpb25zEkkKFHNlYWxlZF9vbmVvZl9leHRlbmRzGAYgAygJQ
  hfiPxQSEnNlYWxlZE9uZW9mRXh0ZW5kc1ISc2VhbGVkT25lb2ZFeHRlbmRzEiEKBm5vX2JveBgHIAEoCEIK4j8HEgVub0JveFIFb
  m9Cb3gSWwoadW5rbm93bl9maWVsZHNfYW5ub3RhdGlvbnMYCCADKAlCHeI/GhIYdW5rbm93bkZpZWxkc0Fubm90YXRpb25zUhh1b
  mtub3duRmllbGRzQW5ub3RhdGlvbnMqCQjoBxCAgICAAiJ/CgpDb2xsZWN0aW9uEh0KBHR5cGUYASABKAlCCeI/BhIEdHlwZVIEd
  HlwZRIqCglub25fZW1wdHkYAiABKAhCDeI/ChIIbm9uRW1wdHlSCG5vbkVtcHR5EiYKB2FkYXB0ZXIYAyABKAlCDOI/CRIHYWRhc
  HRlclIHYWRhcHRlciLuAwoMRmllbGRPcHRpb25zEh0KBHR5cGUYASABKAlCCeI/BhIEdHlwZVIEdHlwZRItCgpzY2FsYV9uYW1lG
  AIgASgJQg7iPwsSCXNjYWxhTmFtZVIJc2NhbGFOYW1lEjwKD2NvbGxlY3Rpb25fdHlwZRgDIAEoCUIT4j8QEg5jb2xsZWN0aW9uV
  HlwZVIOY29sbGVjdGlvblR5cGUSRAoKY29sbGVjdGlvbhgIIAEoCzITLnNjYWxhcGIuQ29sbGVjdGlvbkIP4j8MEgpjb2xsZWN0a
  W9uUgpjb2xsZWN0aW9uEicKCGtleV90eXBlGAQgASgJQgziPwkSB2tleVR5cGVSB2tleVR5cGUSLQoKdmFsdWVfdHlwZRgFIAEoC
  UIO4j8LEgl2YWx1ZVR5cGVSCXZhbHVlVHlwZRIyCgthbm5vdGF0aW9ucxgGIAMoCUIQ4j8NEgthbm5vdGF0aW9uc1ILYW5ub3Rhd
  GlvbnMSJwoIbWFwX3R5cGUYByABKAlCDOI/CRIHbWFwVHlwZVIHbWFwVHlwZRIhCgZub19ib3gYHiABKAhCCuI/BxIFbm9Cb3hSB
  W5vQm94EikKCHJlcXVpcmVkGB8gASgIQg3iPwoSCHJlcXVpcmVkUghyZXF1aXJlZCoJCOgHEICAgIACIpADCgtFbnVtT3B0aW9uc
  xImCgdleHRlbmRzGAEgAygJQgziPwkSB2V4dGVuZHNSB2V4dGVuZHMSQgoRY29tcGFuaW9uX2V4dGVuZHMYAiADKAlCFeI/EhIQY
  29tcGFuaW9uRXh0ZW5kc1IQY29tcGFuaW9uRXh0ZW5kcxIdCgR0eXBlGAMgASgJQgniPwYSBHR5cGVSBHR5cGUSPwoQYmFzZV9hb
  m5vdGF0aW9ucxgEIAMoCUIU4j8REg9iYXNlQW5ub3RhdGlvbnNSD2Jhc2VBbm5vdGF0aW9ucxJRChZyZWNvZ25pemVkX2Fubm90Y
  XRpb25zGAUgAygJQhriPxcSFXJlY29nbml6ZWRBbm5vdGF0aW9uc1IVcmVjb2duaXplZEFubm90YXRpb25zElcKGHVucmVjb2dua
  XplZF9hbm5vdGF0aW9ucxgGIAMoCUIc4j8ZEhd1bnJlY29nbml6ZWRBbm5vdGF0aW9uc1IXdW5yZWNvZ25pemVkQW5ub3RhdGlvb
  nMqCQjoBxCAgICAAiKoAQoQRW51bVZhbHVlT3B0aW9ucxImCgdleHRlbmRzGAEgAygJQgziPwkSB2V4dGVuZHNSB2V4dGVuZHMSL
  QoKc2NhbGFfbmFtZRgCIAEoCUIO4j8LEglzY2FsYU5hbWVSCXNjYWxhTmFtZRIyCgthbm5vdGF0aW9ucxgDIAMoCUIQ4j8NEgthb
  m5vdGF0aW9uc1ILYW5ub3RhdGlvbnMqCQjoBxCAgICAAiJwCgxPbmVvZk9wdGlvbnMSJgoHZXh0ZW5kcxgBIAMoCUIM4j8JEgdle
  HRlbmRzUgdleHRlbmRzEi0KCnNjYWxhX25hbWUYAiABKAlCDuI/CxIJc2NhbGFOYW1lUglzY2FsYU5hbWUqCQjoBxCAgICAAiLjA
  QoTRmllbGRUcmFuc2Zvcm1hdGlvbhJECgR3aGVuGAEgASgLMiUuZ29vZ2xlLnByb3RvYnVmLkZpZWxkRGVzY3JpcHRvclByb3RvQ
  gniPwYSBHdoZW5SBHdoZW4SSwoKbWF0Y2hfdHlwZRgCIAEoDjISLnNjYWxhcGIuTWF0Y2hUeXBlOghDT05UQUlOU0IO4j8LEgltY
  XRjaFR5cGVSCW1hdGNoVHlwZRI5CgNzZXQYAyABKAsyHS5nb29nbGUucHJvdG9idWYuRmllbGRPcHRpb25zQgjiPwUSA3NldFIDc
  2V0IvEBChJQcmVwcm9jZXNzb3JPdXRwdXQSagoPb3B0aW9uc19ieV9maWxlGAEgAygLMi4uc2NhbGFwYi5QcmVwcm9jZXNzb3JPd
  XRwdXQuT3B0aW9uc0J5RmlsZUVudHJ5QhLiPw8SDW9wdGlvbnNCeUZpbGVSDW9wdGlvbnNCeUZpbGUabwoST3B0aW9uc0J5RmlsZ
  UVudHJ5EhoKA2tleRgBIAEoCUII4j8FEgNrZXlSA2tleRI5CgV2YWx1ZRgCIAEoCzIXLnNjYWxhcGIuU2NhbGFQYk9wdGlvbnNCC
  uI/BxIFdmFsdWVSBXZhbHVlOgI4ASoyCglNYXRjaFR5cGUSDAoIQ09OVEFJTlMQABIJCgVFWEFDVBABEgwKCFBSRVNFTkNFEAI6U
  AoHb3B0aW9ucxIcLmdvb2dsZS5wcm90b2J1Zi5GaWxlT3B0aW9ucxj8ByABKAsyFy5zY2FsYXBiLlNjYWxhUGJPcHRpb25zUgdvc
  HRpb25zOlMKB21lc3NhZ2USHy5nb29nbGUucHJvdG9idWYuTWVzc2FnZU9wdGlvbnMY/AcgASgLMhcuc2NhbGFwYi5NZXNzYWdlT
  3B0aW9uc1IHbWVzc2FnZTpLCgVmaWVsZBIdLmdvb2dsZS5wcm90b2J1Zi5GaWVsZE9wdGlvbnMY/AcgASgLMhUuc2NhbGFwYi5Ga
  WVsZE9wdGlvbnNSBWZpZWxkOlYKDGVudW1fb3B0aW9ucxIcLmdvb2dsZS5wcm90b2J1Zi5FbnVtT3B0aW9ucxj8ByABKAsyFC5zY
  2FsYXBiLkVudW1PcHRpb25zUgtlbnVtT3B0aW9uczpcCgplbnVtX3ZhbHVlEiEuZ29vZ2xlLnByb3RvYnVmLkVudW1WYWx1ZU9wd
  GlvbnMY/AcgASgLMhkuc2NhbGFwYi5FbnVtVmFsdWVPcHRpb25zUgllbnVtVmFsdWU6SwoFb25lb2YSHS5nb29nbGUucHJvdG9id
  WYuT25lb2ZPcHRpb25zGPwHIAEoCzIVLnNjYWxhcGIuT25lb2ZPcHRpb25zUgVvbmVvZkInCg9zY2FsYXBiLm9wdGlvbnPiPxMKD
  3NjYWxhcGIub3B0aW9ucxAB"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      com.google.protobuf.descriptor.DescriptorProtoCompanion.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
  val options: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FileOptions, _root_.scala.Option[scalapb.options.ScalaPbOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.ScalaPbOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val message: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.MessageOptions, _root_.scala.Option[scalapb.options.MessageOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.MessageOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val field: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.FieldOptions, _root_.scala.Option[scalapb.options.FieldOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.FieldOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumOptions: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumOptions, _root_.scala.Option[scalapb.options.EnumOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val enumValue: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.EnumValueOptions, _root_.scala.Option[scalapb.options.EnumValueOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.EnumValueOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
  val oneof: _root_.scalapb.GeneratedExtension[com.google.protobuf.descriptor.OneofOptions, _root_.scala.Option[scalapb.options.OneofOptions]] =
    _root_.scalapb.GeneratedExtension.forOptionalUnknownMessageField(1020, _root_.scalapb.UnknownFieldSet.Field.lengthDelimitedLens)({__valueIn => _root_.scalapb.GeneratedExtension.readMessageFromByteString(scalapb.options.OneofOptions)(__valueIn)}, {__valueIn => __valueIn.toByteString})
}
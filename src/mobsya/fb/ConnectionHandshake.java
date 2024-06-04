// automatically generated by the FlatBuffers compiler, do not modify

package mobsya.fb;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class ConnectionHandshake extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static ConnectionHandshake getRootAsConnectionHandshake(ByteBuffer _bb) { return getRootAsConnectionHandshake(_bb, new ConnectionHandshake()); }
  public static ConnectionHandshake getRootAsConnectionHandshake(ByteBuffer _bb, ConnectionHandshake obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ConnectionHandshake __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long minProtocolVersion() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 1L; }
  public long protocolVersion() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 1L; }
  public long maxMessageSize() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 102400L; }
  public int token(int j) { int o = __offset(10); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int tokenLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector tokenVector() { return tokenVector(new ByteVector()); }
  public ByteVector tokenVector(ByteVector obj) { int o = __offset(10); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer tokenAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer tokenInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public boolean localhostPeer() { int o = __offset(12); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public int wsPort() { int o = __offset(14); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public mobsya.fb.NodeId uuid() { return uuid(new mobsya.fb.NodeId()); }
  public mobsya.fb.NodeId uuid(mobsya.fb.NodeId obj) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public String password() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer passwordAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public ByteBuffer passwordInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 18, 1); }

  public static int createConnectionHandshake(FlatBufferBuilder builder,
      long minProtocolVersion,
      long protocolVersion,
      long maxMessageSize,
      int tokenOffset,
      boolean localhostPeer,
      int wsPort,
      int uuidOffset,
      int passwordOffset) {
    builder.startTable(8);
    ConnectionHandshake.addPassword(builder, passwordOffset);
    ConnectionHandshake.addUuid(builder, uuidOffset);
    ConnectionHandshake.addToken(builder, tokenOffset);
    ConnectionHandshake.addMaxMessageSize(builder, maxMessageSize);
    ConnectionHandshake.addProtocolVersion(builder, protocolVersion);
    ConnectionHandshake.addMinProtocolVersion(builder, minProtocolVersion);
    ConnectionHandshake.addWsPort(builder, wsPort);
    ConnectionHandshake.addLocalhostPeer(builder, localhostPeer);
    return ConnectionHandshake.endConnectionHandshake(builder);
  }

  public static void startConnectionHandshake(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addMinProtocolVersion(FlatBufferBuilder builder, long minProtocolVersion) { builder.addInt(0, (int) minProtocolVersion, (int) 1L); }
  public static void addProtocolVersion(FlatBufferBuilder builder, long protocolVersion) { builder.addInt(1, (int) protocolVersion, (int) 1L); }
  public static void addMaxMessageSize(FlatBufferBuilder builder, long maxMessageSize) { builder.addInt(2, (int) maxMessageSize, (int) 102400L); }
  public static void addToken(FlatBufferBuilder builder, int tokenOffset) { builder.addOffset(3, tokenOffset, 0); }
  public static int createTokenVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createTokenVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startTokenVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addLocalhostPeer(FlatBufferBuilder builder, boolean localhostPeer) { builder.addBoolean(4, localhostPeer, false); }
  public static void addWsPort(FlatBufferBuilder builder, int wsPort) { builder.addShort(5, (short) wsPort, (short) 0); }
  public static void addUuid(FlatBufferBuilder builder, int uuidOffset) { builder.addOffset(6, uuidOffset, 0); }
  public static void addPassword(FlatBufferBuilder builder, int passwordOffset) { builder.addOffset(7, passwordOffset, 0); }
  public static int endConnectionHandshake(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ConnectionHandshake get(int j) { return get(new ConnectionHandshake(), j); }
    public ConnectionHandshake get(ConnectionHandshake obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}


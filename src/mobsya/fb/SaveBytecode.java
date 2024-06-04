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
public final class SaveBytecode extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static SaveBytecode getRootAsSaveBytecode(ByteBuffer _bb) { return getRootAsSaveBytecode(_bb, new SaveBytecode()); }
  public static SaveBytecode getRootAsSaveBytecode(ByteBuffer _bb, SaveBytecode obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SaveBytecode __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long requestId() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public mobsya.fb.NodeId nodeId() { return nodeId(new mobsya.fb.NodeId()); }
  public mobsya.fb.NodeId nodeId(mobsya.fb.NodeId obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public String program() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer programAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer programInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createSaveBytecode(FlatBufferBuilder builder,
      long requestId,
      int nodeIdOffset,
      int programOffset) {
    builder.startTable(3);
    SaveBytecode.addProgram(builder, programOffset);
    SaveBytecode.addNodeId(builder, nodeIdOffset);
    SaveBytecode.addRequestId(builder, requestId);
    return SaveBytecode.endSaveBytecode(builder);
  }

  public static void startSaveBytecode(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addRequestId(FlatBufferBuilder builder, long requestId) { builder.addInt(0, (int) requestId, (int) 0L); }
  public static void addNodeId(FlatBufferBuilder builder, int nodeIdOffset) { builder.addOffset(1, nodeIdOffset, 0); }
  public static void addProgram(FlatBufferBuilder builder, int programOffset) { builder.addOffset(2, programOffset, 0); }
  public static int endSaveBytecode(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SaveBytecode get(int j) { return get(new SaveBytecode(), j); }
    public SaveBytecode get(SaveBytecode obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}


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
public final class EventDescription extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static EventDescription getRootAsEventDescription(ByteBuffer _bb) { return getRootAsEventDescription(_bb, new EventDescription()); }
  public static EventDescription getRootAsEventDescription(ByteBuffer _bb, EventDescription obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public EventDescription __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public long fixedSized() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public long index() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }

  public static int createEventDescription(FlatBufferBuilder builder,
      int nameOffset,
      long fixedSized,
      long index) {
    builder.startTable(3);
    EventDescription.addIndex(builder, index);
    EventDescription.addFixedSized(builder, fixedSized);
    EventDescription.addName(builder, nameOffset);
    return EventDescription.endEventDescription(builder);
  }

  public static void startEventDescription(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addFixedSized(FlatBufferBuilder builder, long fixedSized) { builder.addInt(1, (int) fixedSized, (int) 0L); }
  public static void addIndex(FlatBufferBuilder builder, long index) { builder.addInt(2, (int) index, (int) 0L); }
  public static int endEventDescription(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public EventDescription get(int j) { return get(new EventDescription(), j); }
    public EventDescription get(EventDescription obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}


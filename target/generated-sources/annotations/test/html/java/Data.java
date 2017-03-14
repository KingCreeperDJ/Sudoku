package test.html.java;
import net.java.html.json.*;
public final class Data implements Cloneable {
  private static final Html4JavaType TYPE = new Html4JavaType();
  private final org.apidesign.html.json.spi.Proto proto;
  public java.util.List getWords() {
    java.lang.String arg1 = getMessage();
    try {
      proto.acquireLock();
      return test.html.java.DataModel.words(arg1);
    } finally {
      proto.releaseLock();
    }
  }
  private java.lang.String prop_message;
  public java.lang.String getMessage() {
    proto.verifyUnlocked();
    return prop_message;
  }
  public void setMessage(java.lang.String v) {
    proto.verifyUnlocked();
    if (TYPE.isSame(prop_message, v)) return;
    prop_message = v;
    proto.valueHasMutated("message");
    proto.valueHasMutated("words");
  }
  private boolean prop_on;
  public boolean isOn() {
    proto.verifyUnlocked();
    return prop_on;
  }
  public void setOn(boolean v) {
    proto.verifyUnlocked();
    if (TYPE.isSame(prop_on, v)) return;
    prop_on = v;
    proto.valueHasMutated("on");
  }
  private void turnOn(Object data, Object ev) {
    test.html.java.DataModel.turnOn(Data.this);
  }
  private void turnOff(Object data, Object ev) {
    test.html.java.DataModel.turnOff(Data.this);
  }
  private static Class<DataModel> modelFor() { return null; }
  private Data(net.java.html.BrwsrCtx context) {
    this.proto = TYPE.createProto(this, context);
  };
  public Data() {
    this(net.java.html.BrwsrCtx.findDefault(Data.class));
  };
  public Data(java.lang.String message, boolean on) {
    this(net.java.html.BrwsrCtx.findDefault(Data.class));
    this.prop_message = message;
    this.prop_on = on;
  };
  private static class Html4JavaType extends org.apidesign.html.json.spi.Proto.Type<Data> {
    private Html4JavaType() {
      super(Data.class, DataModel.class, 3, 2);
      registerProperty("words", 0, true);
      registerProperty("message", 1, false);
      registerProperty("on", 2, false);
      registerFunction("turnOn", 0);
      registerFunction("turnOff", 1);
    }
    @Override public void setValue(Data data, int type, Object value) {
      switch (type) {
        case 1: data.setMessage(TYPE.extractValue(java.lang.String.class, value)); return;
        case 2: data.setOn(TYPE.extractValue(java.lang.Boolean.class, value)); return;
      }
    }
    @Override public Object getValue(Data data, int type) {
      switch (type) {
        case 0: return data.getWords();
        case 1: return data.getMessage();
        case 2: return data.isOn();
      }
      throw new UnsupportedOperationException();
    }
    @Override public void call(Data model, int type, Object data, Object ev) {
      switch (type) {
        case 0: model.turnOn(data, ev); return;
        case 1: model.turnOff(data, ev); return;
      }
      throw new UnsupportedOperationException();
    }
    @Override public org.apidesign.html.json.spi.Proto protoFor(Object obj) {
      return ((Data)obj).proto;    }
    @Override public void onChange(Data model, int type) {
      switch (type) {
    }
      throw new UnsupportedOperationException();
    }
  @Override public void onMessage(Data model, int index, int type, Object data) {
    switch (index) {
    }
    throw new UnsupportedOperationException("index: " + index + " type: " + type);
  }
    @Override public Data read(net.java.html.BrwsrCtx c, Object json) { return new Data(c, json); }
    @Override public Data cloneTo(Data o, net.java.html.BrwsrCtx c) { return o.clone(c); }
  }
  private Data(net.java.html.BrwsrCtx c, Object json) {
    this(c);
    Object[] ret = new Object[2];
    proto.extract(json, new String[] {
      "message",
      "on",
    }, ret);
    this.prop_message = (java.lang.String)ret[0];
    this.prop_on = ret[1] == null ? false : (TYPE.boolValue(ret[1])).booleanValue();
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('{');
    sb.append('"').append("message").append('"').append(":");
    sb.append(TYPE.toJSON(prop_message));
    sb.append(',');
    sb.append('"').append("on").append('"').append(":");
    sb.append(TYPE.toJSON(prop_on));
    sb.append('}');
    return sb.toString();
  }
  public Data clone() {
    return clone(proto.getContext());
  }
  private Data clone(net.java.html.BrwsrCtx ctx) {
    Data ret = new Data(ctx);
    ret.prop_message = prop_message;
    ret.prop_on = prop_on;
    return ret;
  }
  /** Activates this model instance in the current {@link 
net.java.html.json.Models#bind(java.lang.Object, net.java.html.BrwsrCtx) browser context}. 
In case of using Knockout technology, this means to 
bind JSON like data in this model instance with Knockout tags in 
the surrounding HTML page.
*/
  public Data applyBindings() {
    proto.applyBindings();
    return this;
  }
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Data)) return false;
    Data p = (Data)o;
    if (!TYPE.isSame(prop_message, p.prop_message)) return false;
    if (!TYPE.isSame(prop_on, p.prop_on)) return false;
    return true;
  }
  public int hashCode() {
    int h = Data.class.getName().hashCode();
    h = TYPE.hashPlus(prop_message, h);
    h = TYPE.hashPlus(prop_on, h);
    return h;
  }
}

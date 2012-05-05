package chronos;

import java.util.List;

public class ChronosValue implements Comparable<ChronosValue> {

//  public static final ChronosValue NULL = new ChronosValue();
//  public static final ChronosValue VOID = new ChronosValue();

  private Object value;

//  private ChronosValue() {
//    // private constructor: only used for NULL and VOID
//    value = new Object();
//  }

  public ChronosValue(Object v) {
    if(v == null) {
      throw new RuntimeException("v == null");
    }
    value = v;
    // only accept boolean, list, number or string types
    if(!(isNumber() || isDays() || isString() )) {
      throw new RuntimeException("invalid type: " + v + " (" + v.getClass() + ")");
    }
  }

  public Integer asInt() {
	    return ((Number)value).intValue();
  }

  public Double asDouble() {
    return ((Number)value).doubleValue();
  }
  
  public Days asDays() {
	    return (Days)value;
  }

  @SuppressWarnings("unchecked") 
  public List<ChronosValue> asList() {
    return (List<ChronosValue>)value;
  }

  public String asString() {
    return (String)value;
  }

  @Override
  public int compareTo(ChronosValue that) {
    if(this.isNumber() && that.isNumber()) {
      if(this.equals(that)) {
        return 0;
      }
      else {
        return this.asDouble().compareTo(that.asDouble());
      }
    }
    else if(this.isString() && that.isString()) {
      return this.asString().compareTo(that.asString());
    }
    else {
      throw new RuntimeException("illegal expression: can't compare `" + 
          this + "` to `" + that + "`");
    }
  }

  @Override
  public boolean equals(Object o) {
//    if(this == VOID || o == VOID) {
//      throw new RuntimeException("can't use VOID: " + this + " ==/!= " + o);
//    }
    if(this == o) {
      return true;
    }
    if(o == null || this.getClass() != o.getClass()) {
      return false;
    }
    ChronosValue that = (ChronosValue)o;
    if(this.isNumber() && that.isNumber()) {
      double diff = Math.abs(this.asDouble() - that.asDouble());
      return diff < 0.00000000001;
    }
    else {
      return this.value.equals(that.value);
    }
  }

  @Override
  public int hashCode() {
    return value.hashCode();
  }

  public boolean isNumber() {
    return value instanceof Number;
  }

  public boolean isList() {
    return value instanceof List<?>;
  }
  
  public boolean isDays() {
	    return value instanceof Days;
  }

//  public boolean isNull() {
//    return this == NULL;
//  }

//  public boolean isVoid() {
//    return this == VOID;
//  }

  public boolean isString() {
    return value instanceof String;
  }

  @Override
  public String toString() {
	  return String.valueOf(value);
//    return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);
  }
}
import java.util.List;

public class Value implements Comparable<Value> {

	private Object value;

	public Value(Object v) {
		if (v == null) {
			throw new RuntimeException("v is null");
		}
		value = v;
	}

	public int compareTo(Value that) {
			if (this.isInt() && that.isInt()) {
					if (this.equals(that)) {
							return 0;
					}
					else {
							return this.asDouble().compareTo(that.asDouble());
					}
			}
	}


}

package chronos.nodes;

import java.util.List;

public class CVal implements Comparable<CVal> {

	private Object value;

	public CVal(Object v) {
		if (v == null) {
			throw new RuntimeException("v == null");
		}
		value = v;
		// only accept one of our datetypes
		if (!(isNumber() || isDayblock() || isTime() || isTimeblock()
				|| isDatetime() || isString() || isCourse() || isCourselist() || isSchedule())) {
			throw new RuntimeException("invalid type: " + v + " ("
					+ v.getClass() + ")");
		}
	}

	public Integer asInt() {
		return ((Number) value).intValue();
	}

	public Double asDouble() {
		return ((Number) value).doubleValue();
	}

	public Dayblock asDayblock() {
		return (Dayblock) value;
	}

	public Time asTime() {
		return (Time) value;
	}

	public Timeblock asTimeblock() {
		return (Timeblock) value;
	}

	public Datetime asDatetime() {
		return (Datetime) value;
	}

	public String asString() {
		return (String) value;
	}

	public Course asCourse() {
		return (Course) value;
	}

	public Courselist asCourselist() {
		return (Courselist) value;
	}

	public Schedule asSchedule() {
		return (Schedule) value;
	}

	@Override
	public int compareTo(CVal that) {
		if (this.isNumber() && that.isNumber()) {
			if (this.equals(that)) {
				return 0;
			} else {
				return this.asDouble().compareTo(that.asDouble());
			}
		} else if (this.isDayblock() && that.isDayblock()) {
			return this.asDayblock().compareTo(that.asDayblock());
		} else if (this.isTime() && that.isTime()) {
			return this.asTime().compareTo(that.asTime());
		} else if (this.isTimeblock() && that.isTimeblock()) {
			return this.asTimeblock().compareTo(that.asTimeblock());
		} else if (this.isDatetime() && that.isDatetime()) {
			return this.asDatetime().compareTo(that.asDatetime());
		} else if (this.isString() && that.isString()) {
			return this.asString().compareTo(that.asString());
		} else if (this.isCourse() && that.isCourse()) {
			return this.asCourse().compareTo(that.asCourse());
		} else if (this.isCourselist() && that.isCourselist()) {
			return this.asCourselist().compareTo(that.asCourselist());
		} else if (this.isSchedule() && that.isSchedule()) {
			return this.asSchedule().compareTo(that.asSchedule());
		} else {
			throw new RuntimeException("illegal expression: can't compare `"
					+ this + "` to `" + that + "`");
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		CVal that = (CVal) o;
		if (this.isNumber() && that.isNumber()) {
			double diff = Math.abs(this.asDouble() - that.asDouble());
			return diff < 0.00000000001;
		} else {
			return this.value.equals(that.value);
		}
	}
	
	public Object value(){
		if (this.isInt()) {
			return this.asInt();
		} else if (this.isDouble()) {
			return this.asDouble();
		}  else if (this.isDayblock()) {
			return this.asDayblock();
		}	else if (this.isTime()) {
			return this.asTime();
		}	else if (this.isTimeblock()) {
			return this.asTimeblock();
		}	else if (this.isDatetime()) {
			return this.asDatetime();
		}	else if (this.isString()) {
			return this.asString();
		}	else if (this.isCourse()) {
			return this.asCourse();
		}	else if (this.isCourselist()) {
			return this.asCourselist();
		}	else if (this.isSchedule()) {
			return this.asSchedule();
		}	else {
			throw new RuntimeException("illegal expression: can't get value of `"
					+ this + "`");
		}
		
	public String typename(){
		if (this.isInt()) {
			return "Integer";
		} else if (this.isDouble()) {
			return "Double";
		}  else if (this.isDayblock()) {
			return "Dayblock";
		}	else if (this.isTime()) {
			return "Time";
		}	else if (this.isTimeblock()) {
			return "Timeblock";
		}	else if (this.isDatetime()) {
			return "Datetime";
		}	else if (this.isString()) {
			return "String";
		}	else if (this.isCourse()) {
			return "Course";
		}	else if (this.isCourselist()) {
			return "Courselist";
		}	else if (this.isSchedule()) {
			return "Schedule";
		}	else {
			throw new RuntimeException("illegal expression: can't get type of `"
					+ this + "`");
		}
	}
	
	public boolean isBool(){
		if (this.isInt && (this.value == 1 || this.value == 0) ) {
			return true
		}
		else {
			return false
		}
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isNumber() {
		return value instanceof Number;
	}
	
	public boolean isInt() {
		return value instanceof Integer;
	}
	
	public boolean isDouble() {
		return value instanceof Double;
	}

	public boolean isList() {
		return value instanceof List<?>;
	}

	public boolean isDayblock() {
		return value instanceof Dayblock;
	}

	public boolean isTime() {
		return value instanceof Time;
	}

	public boolean isTimeblock() {
		return value instanceof Timeblock;
	}

	public boolean isDatetime() {
		return value instanceof Datetime;
	}

	public boolean isString() {
		return value instanceof String;
	}

	public boolean isCourse() {
		return value instanceof Course;
	}

	public boolean isCourselist() {
		return value instanceof Courselist;
	}

	public boolean isSchedule() {
		return value instanceof Schedule;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
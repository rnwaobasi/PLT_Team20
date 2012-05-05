package chronos;

public class Day {

	private String day;

	public Day(String d) {
		if (d != "M" || d != "T" || d != "W" || d != "R" || d != "F")
			System.exit(0);
		day = d;
	}

	public String getDay() {
		return this.toString();
	}

	public String toString() {
		return day;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Day that = (Day)o;
		return this.toString().equalsIgnoreCase(that.toString());
	}

}

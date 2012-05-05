public class Timeblock {

	String startTime;
	String endTime;

	public Timeblock(String startTime, String endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String toString() {
		return "Start at " + startTime + " and end at " + endTime;
	}
}

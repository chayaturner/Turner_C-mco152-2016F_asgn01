package asgn01;

public class Subtractor {

	private int first;
	private int second;
	private int difference;

	public Subtractor(int first, int second) {
		this.first = first;
		this.second = second;
	}

	int subtract() {
		this.difference = first - second;
		return difference;
	}
}

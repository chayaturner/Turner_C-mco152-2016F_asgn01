package asgn01;

public class Adder {

	private int first;
	private int second;
	private int sum;

	public Adder(int first, int second) {
		this.first = first;
		this.second = second;
	}

	int add() {
		this.sum = first + second;
		return sum;
	}
}

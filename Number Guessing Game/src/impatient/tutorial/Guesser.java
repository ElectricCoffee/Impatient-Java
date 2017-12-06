package impatient.tutorial;

public class Guesser {
	private int min, max;
	
	public Guesser(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public int guess() {
		return (min + max) / 2;
	}
	
	public void lower() {
		max = guess() - 1;
	}
	
	public void higher() {
		min = guess() + 1;
	}
}

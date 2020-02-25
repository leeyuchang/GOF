package ch14.chain;

public class Trobule {
	
	private int number;

	public Trobule(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Trobule [number=" + number + "]";
	}

}

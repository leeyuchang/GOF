package ch17.observer;

public class Main {

	public static void main(String[] args) {
		
		NumberGenerator subject = RandomNumberGenerator.getInstance();
		
		subject.addObserver(new DigitObserver());
		subject.addObserver(new GraphObserver());
		
		subject.execute();
		
	}

}

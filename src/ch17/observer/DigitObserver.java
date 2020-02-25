package ch17.observer;

public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator subject) {

		int num = subject.getNumber();
		System.out.println("DigitObserver : " + num);
	}

}

package ch17.observer;

public class GraphObserver implements Observer {

	@Override
	public void update(NumberGenerator subject) {
		int num = subject.getNumber();
		System.out.println("GraphObserver : " + num);
	}

}

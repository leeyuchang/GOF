package ch17.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {

	private List<Observer> list = new ArrayList<>();

	public synchronized void addObserver(Observer o) {
		list.add(o);
	}

	public synchronized void removeObserver(Observer o) {
		list.remove(o);
	}

	public synchronized void noticeAll() {
		list.stream().forEach(o -> o.update(this));
	}
	
	abstract int getNumber();
	abstract void execute();
}

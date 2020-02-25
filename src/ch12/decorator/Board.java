package ch12.decorator;

public abstract class Board extends Display {

	protected Display display;

	protected Board(Display display) {
		super();
		this.display = display;
	}
}

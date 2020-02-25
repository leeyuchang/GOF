package ch12.decorator;

public class SideBoard extends Board {
	
	private char boarderChar;
	
	public SideBoard(Display display, char ch) {
		super(display);
		this.boarderChar = ch;
	}

	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		return boarderChar + display.getRowText(row) + boarderChar;
	}

}

package ch12.decorator;

public class Main {

	public static void main(String[] args) {

		Display b1 = new StringDisplay("Hello world");
		Display b2 = new SideBoard(b1, '#');
		Display b3 = new FullBoard(b2);

		b1.show();
		b2.show();
		b3.show();

//		Display b4 = new SideBoard(
//				new FullBoard(new FullBoard(new SideBoard(new FullBoard(new StringDisplay("")), '*'))), '/');

	}

}

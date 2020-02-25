package ch13.visitor;

public class File extends Entry {

	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	

	@Override
	String getName() {
		return name;
	}

	@Override
	int getSize() {
		return size;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}

package ch13.visitor;

import java.util.List;

import ch11.composite.FileTreatementException;

public abstract class Entry implements Element {
	
	public abstract String getName();
	public abstract int getSize();
	
	public Entry add(Entry entrty) throws FileTreatementException {
		throw new FileTreatementException("");
	}

	public List<Entry> asList() throws FileTreatementException {
		throw new FileTreatementException("");
	}
	
	public String toString() {
		return getName() + " (" + getSize() + ") ";
	}
}

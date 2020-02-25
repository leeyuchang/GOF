package ch13.visitor;

import java.util.List;

import ch11.composite.FileTreatementException;

public abstract class Entry implements Element {
	
	abstract String getName();
	abstract int getSize();
	
	public Entry add(Entry entrty) throws FileTreatementException {
		throw new FileTreatementException("");
	}

	public List<Entry> iterator() throws FileTreatementException {
		throw new FileTreatementException("");
	}
	
	public String toString() {
		return getName() + " (" + getSize() + ") ";
	}
}

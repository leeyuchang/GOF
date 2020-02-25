package ch11.composite;

public abstract class Entry {
	abstract String getName();

	abstract int getSize();

	public Entry Add(Entry entry) throws FileTreatementException {
		throw new FileTreatementException("");
	}

	public void printList() {
		printList("");
	}

	protected abstract void printList(String prefix);

	public String toString() {
		return getName() + " (" + getSize() + ") ";
	}
}

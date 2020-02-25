package ch11.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

	private String name;
	private List<Entry> directory = new ArrayList<>();

	public Directory(String name) {
		super();
		this.name = name;
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	int getSize() {
		int size = 0;
		for (Entry e : directory) {
			size += e.getSize();
		}
		return size;
	}

	@Override
	public Entry Add(Entry entry) throws FileTreatementException {
		directory.add(entry);
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		for (Entry e : directory) {
			e.printList(prefix + "/" + getName());
		}
	}

}

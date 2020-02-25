package ch13.visitor;

import java.util.ArrayList;
import java.util.List;

import ch11.composite.FileTreatementException;

public class Directory extends Entry {

	private String name;
	private List<Entry> dir = new ArrayList<>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (Entry e : dir) {
			size += e.getSize();
		}
		return size;
	}

	@Override
	public Entry add(Entry entrty) throws FileTreatementException {
		dir.add(entrty);
		return this;
	}

	@Override
	public List<Entry> asList() throws FileTreatementException {
		return dir;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}

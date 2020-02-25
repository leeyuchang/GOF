package ch13.visitor;

public abstract class Visitor {
	abstract void visit(File file);
	abstract void visit(Directory directory);
}

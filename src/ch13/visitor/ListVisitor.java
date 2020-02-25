package ch13.visitor;

public class ListVisitor extends Visitor {

	private String currentdir = "";

	@Override
	void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	@Override
	void visit(Directory directory) {
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		for (Entry e : directory.asList()) {
			e.accept(this);
		}
		currentdir = savedir;
	}
}

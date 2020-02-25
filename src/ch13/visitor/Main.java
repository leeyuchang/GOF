package ch13.visitor;

public class Main {

	public static void main(String[] args) {
		System.out.println("Making root entries...");
		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory tmpdir = new Directory("tmp");
		Directory usrdir = new Directory("usr");
		
		
		rootdir.add(bindir)
			   .add(tmpdir)
			   .add(usrdir);
			   
		rootdir.accept(new ListVisitor());
		
//		System.out.println("");
//		System.out.println("Making user entrirs...");
//		Directory yuki = new
//		bindir.add(new File("vi", 10000))
//			  .add(new File("latex", 20000));
		
	}

}

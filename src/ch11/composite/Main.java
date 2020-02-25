package ch11.composite;

public class Main {

	public static void main(String[] args) {
		System.out.println("Making root entries...");
		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory tmpdir = new Directory("tmp");
		Directory usrdir = new Directory("usr");
		
		
		
		rootdir.Add(bindir)
			   .Add(tmpdir)
			   .Add(usrdir);
		
		bindir.Add(new File("vi", 10000))
			  .Add(new File("latex", 20000));
		
		rootdir.printList();
	}

}

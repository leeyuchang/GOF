package chxx.ramda.command;

public class Main {

  private static Editor editor;

  public static void main(String[] args) {
    
    Macro macro = new Macro();
    macro.record(new Open(editor));

  }

}

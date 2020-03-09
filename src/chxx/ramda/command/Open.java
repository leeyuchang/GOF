package chxx.ramda.command;

public class Open implements Action {

  private final Editor editor;
  
  public Open(Editor editor) {
    this.editor = editor;
    System.out.println(this.editor);
  }

  @Override
  public void perform() {
    editor.open();
  }
  
}

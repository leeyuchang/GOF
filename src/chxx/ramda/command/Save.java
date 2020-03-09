package chxx.ramda.command;

public class Save implements Action {
  
  private final Editor editor;

  public Save(Editor editor) {
    super();
    this.editor = editor;
  }

  @Override
  public void perform() {
    editor.save();
  }

}

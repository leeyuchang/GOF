package ch16.mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {

  private static final long serialVersionUID = 1L;
  private Mediator mediator;

  public ColleagueTextField(String text, int columns) {
    super(text, columns);
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
    setBackground(enabled ? Color.white : Color.lightGray);
  }

  @Override
  public void textValueChanged(TextEvent e) {
    mediator.colleagueChanged();
  }

}

package ch03.template;

public class StringDisplay implements AbstractDisplay {

  private String string;
  private int width;

  public StringDisplay(String string) {
    this.string = string;
    this.width = string.codePointCount(0, string.length());
  }

  @Override
  public void open() {
    printLine();
  }

  @Override
  public void print() {
    System.out.println("|" + string + "|");
  }

  @Override
  public void close() {
    printLine();
  }

  private void printLine() {
    System.out.print("+");
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }

}

package chxx.ramda.factory;

public class Bond implements Product {

  public Bond() {
    super();
  }

  @Override
  public void run() {
    System.out.println("Bond");
  }
}

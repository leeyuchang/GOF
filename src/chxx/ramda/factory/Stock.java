package chxx.ramda.factory;

public class Stock implements Product {

  public Stock() {
    super();
  }

  @Override
  public void run() {
    System.out.println("Stock");
  }

}

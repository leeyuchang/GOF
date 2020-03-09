package chxx.ramda.factory;


public class Main {

  public static void main(String[] args) {
    Product p = Factory.createProduct("stock");
    p.run();
  }

}

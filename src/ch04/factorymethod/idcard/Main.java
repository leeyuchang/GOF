package ch04.factorymethod.idcard;

import ch04.factorymethod.framework.Factory;
import ch04.factorymethod.framework.Product;

public class Main {

  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("Tommy");
    Product card2 = factory.create("Adam");
    Product card3 = factory.create("Eve");
    card1.use();
    card2.use();
    card3.use();
  }

}

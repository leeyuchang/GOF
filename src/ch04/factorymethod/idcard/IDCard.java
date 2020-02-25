package ch04.factorymethod.idcard;

import ch04.factorymethod.framework.Product;

public class IDCard implements Product {

  private String owner;

  public IDCard(String owner) {
    System.out.println(owner + "のカードを作ります。");
    this.owner = owner;
  }

  @Override
  public void use() {
    System.out.println(owner + "のカードを使います。");
  }

  public String getOwner() {
    return owner;
  }

}

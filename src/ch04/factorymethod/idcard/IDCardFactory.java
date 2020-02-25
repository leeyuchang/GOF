package ch04.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import ch04.factorymethod.framework.Factory;
import ch04.factorymethod.framework.Product;

public class IDCardFactory implements Factory {

  private List<String> owners = new ArrayList<>();

  @Override
  public Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  public void registerProduct(Product product) {
    owners.add(((IDCard)product).getOwner());
  }

}

package ch04.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import ch04.factorymethod.framework.Factory;
import ch04.factorymethod.framework.Product;

public class IDCardFactory extends Factory {

  private List<String> owners = new ArrayList<>();

  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    owners.add(((IDCard)product).getOwner());
  }

}

package ch04.factorymethod.framework;

public interface Factory {

  default public Product create(String owner) {
    Product p = createProduct(owner);
    registerProduct(p);
    return p;
  }

  public Product createProduct(String owner);

  public void registerProduct(Product product);
}

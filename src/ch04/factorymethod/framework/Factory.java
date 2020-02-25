package ch04.factorymethod.framework;

public abstract class Factory {

  protected abstract Product createProduct(String owner);
  
  protected abstract void registerProduct(Product product);

  public Product create(String owner) {
    Product p = createProduct(owner);
    registerProduct(p);
    return p;
  }

}

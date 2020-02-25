package ch05.singleton;

public class Singleton {
  
  private static Singleton singleton = new Singleton();
  
  private Singleton() {
    System.out.println("Instance");
  }
  
  public static Singleton getInstance() {
    return singleton;
  }
}

package chxx.ramda.factory;

public class Loan implements Product{

  public Loan() {
    super();
  }

  @Override
  public void run() {
    System.out.println("Loan");
  }

}

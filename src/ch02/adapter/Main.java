package ch02.adapter;

public class Main {

  public static void main(String[] args) {
    Print p = new PrintBanner(new Banner("Hello"));
    p.printWeek();
    p.printStrong();
  }
}

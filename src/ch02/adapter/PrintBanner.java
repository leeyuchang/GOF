package ch02.adapter;

public class PrintBanner implements Print {

  private final Banner banner;

  public PrintBanner(Banner banner) {
    this.banner = banner;
  }

  @Override
  public void printWeek() {
    banner.showWithParan();
  }

  @Override
  public void printStrong() {
    banner.showWithAster();
  }
}

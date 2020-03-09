package chxx.ramda.strategy;

import java.io.IOException;
import java.nio.file.Path;

public class Main {

  public static void main(String[] args) {
    Compressor gzipCompressor = new Compressor(new ZipCompressionStrategy());
    try {
      gzipCompressor.compress(
          Path.of("C:\\Users\\leeyu\\Downloads\\img2mb (3).jpg"),
          Path.of("C:\\Users\\leeyu\\Downloads\\zip_img2mb (3).jpg").toFile()
          );
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

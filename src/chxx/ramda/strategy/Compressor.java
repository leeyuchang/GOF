package chxx.ramda.strategy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Compressor {
  private final CompressionStrategy strategy;

  public Compressor(CompressionStrategy strategy) {
    this.strategy = strategy;
  }

  public void compress(Path in, File out) throws IOException {
    try (OutputStream outStream = new FileOutputStream(out)) {
      Files.copy(in, strategy.compress(outStream));
    }
  }

}

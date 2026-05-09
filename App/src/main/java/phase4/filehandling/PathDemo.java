package phase4.filehandling;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
  public static void main(String[] args) {
    Path path = Paths.get("test.txt");
    System.out.println(path.toAbsolutePath());
  }
}

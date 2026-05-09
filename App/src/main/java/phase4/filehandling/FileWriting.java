package phase4.filehandling;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
  static void main(String[] args) {
    try{
      FileWriter writer=new FileWriter("test.txt");
      writer.write("Hello from java");
      writer.close();
      System.out.println("Write is complete");
    }catch (IOException e){
      System.out.println(e.getMessage());
    }
  }
}

package phase4.filehandling;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReading {
  public static void main(String[] args) {
    try{
      BufferedReader reader=new BufferedReader(new FileReader("test.txt"));
      String line;
      while((line = reader.readLine()) != null){
        System.out.println(line);
      }
      reader.close();
    }catch (IOException e){
      System.out.println(e.getMessage());
    }
  }
}

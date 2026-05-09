package phase4.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
  static void main(String[] args) {
    File file=new File("test.txt");
    try{
      if(file.createNewFile()){
        System.out.println("File created");
      }else{
        System.out.println("File already exists");
      }
    }catch (IOException e){
      System.out.println(e.getMessage());
    }
  }
}

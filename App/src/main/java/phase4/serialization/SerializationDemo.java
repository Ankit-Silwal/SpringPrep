package phase4.serialization;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
  static void main(String[] args) {
    Student s1=new Student("Ankit",22);
    try{
      ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("student.ser"));
      out.writeObject(s1);
      out.close();
      System.out.println("Object serizalized");
    }catch (IOException e){
      System.out.println(e.getMessage());
    }

  }
}

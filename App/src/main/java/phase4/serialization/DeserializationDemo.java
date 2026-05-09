package phase4.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
  static void main(String[] args) {
    try{
      ObjectInputStream in=new ObjectInputStream(new FileInputStream("student.ser"));
      Student s=(Student)in.readObject();
      System.out.println(s);
      in.close();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}

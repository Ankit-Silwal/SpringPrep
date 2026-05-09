package phase2.collectionframework.arraylist;

import java.util.ArrayList;

public class ReferenceMutation {
  static void main(String[] args) {
    ArrayList<Student> students=new ArrayList<>();
    Student s1=new Student("Ankit");
    students.add(s1);
    students.getFirst().display();
    s1.name="Ankit";
    students.getFirst().display();
  }
}
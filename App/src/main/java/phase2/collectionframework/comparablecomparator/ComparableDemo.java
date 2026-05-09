package phase2.collectionframework.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
  public static void main(String[] args) {
    ArrayList<Student> students=new ArrayList<>();
    students.add(new Student("Ankit",34));
    students.add(new Student("Adil",70));
    students.add(new Student("Rahul",33));
    Collections.sort(students);
    System.out.println(students);
  }

}

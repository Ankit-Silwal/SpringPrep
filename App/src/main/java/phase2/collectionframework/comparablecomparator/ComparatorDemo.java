package phase2.collectionframework.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("ankit", 90));
    students.add(new Student("adil", 70));
    students.add(new Student("rahul", 33));

    Collections.sort(students, Comparator.comparingInt(s -> s.marks));
    System.out.println(students);
  }
}

package phase2.collectionframework.comparablecomparator;

import java.util.ArrayList;
import java.util.Comparator;

public class MultipleComparators {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("ankit", 90));
    students.add(new Student("adil", 70));
    students.add(new Student("rahul", 33));

    students.sort(Comparator.comparing(s -> s.name));
    System.out.println(students);
    students.sort(Comparator.comparingInt((Student s) -> s.marks).reversed());
    System.out.println(students);
  }
}

package phase2.collectionframework.comparablecomparator;

public class MultipleComparators {
  public static void main(String[] args) {
    java.util.ArrayList<Student> students = new java.util.ArrayList<>();
    students.add(new Student("ankit", 90));
    students.add(new Student("adil", 70));
    students.add(new Student("rahul", 33));

    students.sort(java.util.Comparator.comparing(s -> s.name));
    System.out.println(students);
    students.sort(java.util.Comparator.comparingInt((Student s) -> s.marks).reversed());
    System.out.println(students);
  }
}

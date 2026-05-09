package phase2.collectionframework.comparablecomparator;

public class Student implements Comparable<Student>{
  String name;
  int marks;
  public Student(String name,int marks){
    this.name=name;
    this.marks=marks;
  }
  @Override
  public int compareTo(Student other){
    return this.marks-other.marks;
  }

  public String toString(){
    return name+" "+marks;
  }
}

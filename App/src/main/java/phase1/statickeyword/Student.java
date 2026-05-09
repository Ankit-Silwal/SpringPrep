package phase1.statickeyword;

public class Student {
  String name;
  static int totalStudents=0;
  public Student(String name){
    this.name=name;
    totalStudents++;
  }
  public void display(){
    System.out.println(name);
  }
}

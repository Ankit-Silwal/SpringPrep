package phase1.memoryreferences;

public class Student {
  String name;
  public Student(String name){
    this.name=name;
  }
  public Student(){
    this("Test");
  }
  public void display(){
    System.out.println(name);
  }
}

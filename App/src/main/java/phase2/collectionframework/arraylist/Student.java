package phase2.collectionframework.arraylist;

public class Student {
  public String name;
  public Student(String name){
    this.name=name;
  }
  public Student(){
    this("Test value");
  }
  public void display(){
    System.out.println(name);
  }
}

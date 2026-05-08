package phase1.constructor;

public class Student {
  private int age;
  private String name;
  public Student(){
    this.name="Test";
    this.age=18;
  }
  public Student(String name){
    this.name=name;
    this.age=69;
  }
  public Student(String name,int age){
    this.name=name;
    this.age=age;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

}

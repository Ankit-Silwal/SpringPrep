package phase1.classes;

public class Student {
  private int id;
  private String name;
  private int age;

  public Student(int id,String name,int age){
    this.id=id;
    this.name=name;
    this.age=age;
  }

  public void setName(String name){
    this.name=name;
  }

  public void setAge(int age){
    this.age=age;
  }

  public void get(){
    System.out.printf("Student:%S \nAge:%d \nID:%d\n",name,age,id);
  }

  public String getName(){
    return this.name;
  }

}

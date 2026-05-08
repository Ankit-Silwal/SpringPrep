package phase1.inheritance;

public class Animal {
  protected String name;
  protected int age;
  public Animal(){
    System.out.println("The shit is made without value hehe");
  }
  public Animal(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void eat(){
    System.out.println(name+"is eating ");
  }
  public void sound(){
    System.out.println("The shitty sound is playing");
  }
}

package phase1.polymorphism;

public class Animal {
  protected String name;
  protected int age;
  public Animal(){
    this("Test",14);
  }
  public Animal(String name,int age){
    this.name=name;
    this.age=age;
  }
  public void info(){
    System.out.printf("%s is of age %d\n",name,age);
  }
  public void sound(){
    System.out.println("This is the base sound of the animal\n");
  }
}

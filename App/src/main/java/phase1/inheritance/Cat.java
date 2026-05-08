package phase1.inheritance;

public class Cat extends Animal{
  public Cat(String name,int age){
    super(name,age);
  }
  public void meow(){
    System.out.println("The cat does the meow");
  }
}

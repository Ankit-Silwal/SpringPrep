package phase1.polymorphism;

public class Parrot extends Animal{
  public Parrot(String name,int age){
    super(name, age);
  }
  public Parrot(){
    super();
  }
  public void sound(){
    super.sound();
    System.out.println("This is the sound of parrot");
  }
  public void aabaj(){
    super.sound();
  }
}

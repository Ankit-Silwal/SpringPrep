package phase1.polymorphism;

public class Cat extends Animal{
  public Cat(String name,int age){
    super(name,age);
  }
  public Cat(){
    super();
  }
  @Override
  public void sound() {
    super.sound();
    System.out.println("This si aabaj of cat fucker");
  }
}

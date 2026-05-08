package phase1.inheritance;

public class Dog extends Animal{
  public Dog(String name,int age){
    super(name,age);
  }
  public void sound(){
    System.out.println("yeah the sound is playing dumb");
  }
  public void bark(){
    System.out.println("The dog is barking sir");
  }
}

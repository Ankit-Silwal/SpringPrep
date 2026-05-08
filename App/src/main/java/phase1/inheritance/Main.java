package phase1.inheritance;

public class Main {
  public static void main(String[] args){
    Dog d=new Dog("Tommy",6);
    d.bark();
    d.eat();
    d.sound();
    Cat c=new Cat("Puss",9);
    c.meow();
    c.eat();
  }
}

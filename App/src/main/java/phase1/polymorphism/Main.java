package phase1.polymorphism;

public class Main {
  public static void main(String[] args){
    Animal[] animals={
           new Dog(),
           new Cat(),
           new Parrot()
    };
    for(Animal a:animals){
      a.sound();
      a.info();
    }
  }
}

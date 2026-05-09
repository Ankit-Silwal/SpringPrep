package phase1.composition;

public class ReferenceSharing {
  static void main(String[] args) {
    Engine e1=new Engine(3333);
    Car c1=new Car("Audi",e1);
    Car c2=new Car("BMW",e1);

    c1.showDetails();
    c2.showDetails();
    c1.StartCar();
    c2.StartCar();
  }
}

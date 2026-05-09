package phase1.composition;

public class Main {
  public static void main(String[] args) {
    Engine e1=new Engine(444);
    Car c1=new Car("BMW",e1);
    c1.StartCar();
    c1.showDetails();
  }
}

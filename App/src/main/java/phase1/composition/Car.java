package phase1.composition;

public class Car {
  private String brand;
  private Engine engine;

  public Car(String name,Engine engine){
    this.brand=name;
    this.engine=engine;
  }

  public void StartCar(){
    System.out.printf("%s starting\n",brand  );
    engine.start();
  }

  public void showDetails(){
    System.out.println(brand);
    engine.show();
  }
}

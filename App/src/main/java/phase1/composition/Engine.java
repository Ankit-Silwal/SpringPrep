package phase1.composition;

public class Engine {
  private int horsepower;
  public Engine(int horsepower){
    this.horsepower=horsepower;
  }
  public void start(){
    System.out.println("The Engine has started");
  }
  public void show(){
    System.out.println(horsepower);
  }
}

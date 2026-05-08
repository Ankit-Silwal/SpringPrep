package phase1.constructor;

public class Chaining {
  private String name;
  private int age;
  public Chaining(){
    this("Unknown",0);
  }
  public Chaining(String name,int age){
    this.name=name;
    this.age=age;
  }

  public Chaining(int age){
    this("Unknowm",16);
  }

  public Chaining(String name){
    this(name,69);
  }
}

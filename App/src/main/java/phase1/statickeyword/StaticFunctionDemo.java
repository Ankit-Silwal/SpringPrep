package phase1.statickeyword;

public class StaticFunctionDemo {
  static void greet(){
    System.out.println("This is static greet");
  }

  static void main(String[] args) {
    greet();
    StaticFunctionDemo.greet();
  }
}


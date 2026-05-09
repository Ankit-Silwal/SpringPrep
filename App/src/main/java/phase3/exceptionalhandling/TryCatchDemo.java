package phase3.exceptionalhandling;

public class TryCatchDemo {
  public static void main(String[] args) {
    try{
      int x=10/0;
      System.out.println(x);
    }catch (ArithmeticException e){
      System.out.println("Can't divide by 0");
    }
    System.out.println("Program  continues");
  }
}

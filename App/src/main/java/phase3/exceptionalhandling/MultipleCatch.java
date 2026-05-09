package phase3.exceptionalhandling;

public class MultipleCatch {
  public static void main() {
    try{
      String s=null;
      System.out.println(s.length());
    }catch (ArithmeticException e){
      System.out.println("Arithmetic Problem");
    }catch (NullPointerException e){
      System.out.println("Null problem");
    }
  }
}

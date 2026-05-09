package phase3.exceptionalhandling;

public class FinallyDemo {
  static void main(String[] args) {
    try{
      int x=10/0;
    }catch (Exception e){
      System.out.println("Exception handled");
    }finally {
      System.out.println("Finally ran ");
    }
  }
}

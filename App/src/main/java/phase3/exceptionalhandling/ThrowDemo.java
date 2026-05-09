package phase3.exceptionalhandling;

public class ThrowDemo {
  public static void validateAge(int age){
    if(age<18){
      throw new RuntimeException("Age must be 10");
    }
    System.out.println("Valid age");
  }
  public static void main(String[] args){
    validateAge(13);
  }

}

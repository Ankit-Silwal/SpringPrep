package phase3.exceptionalhandling;

class InvalidAmountException extends Exception{
  public InvalidAmountException(String message){
    super(message);
  }
}
public class CustomException {
  public static void withdraw(int amount) throws InvalidAmountException{
    if(amount<=0){
      throw new InvalidAmountException("INvalid amount");
    }
  }

  static void main(String[] args) {
    try{
      withdraw(-100);
    }catch (InvalidAmountException e){
      System.out.println(e.getMessage());
    }
  }
}

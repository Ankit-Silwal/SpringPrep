package phase1.interfaces;

public class CreditCardPayment implements Payment{
  @Override
  public void pay(int amount){
    System.out.printf("%d amount has been paid",amount);
  }
  @Override
  public void refund(int amount){
    System.out.printf("%d amount was refund ",amount);
  }
}

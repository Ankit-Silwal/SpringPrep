package phase1.interfaces;

public class UpiPayment implements Payment{
  @Override
  public void pay(int amount){
    System.out.printf("%d amount was paid",amount);
  }
  @Override
  public void refund(int amount){
    System.out.printf("%d amount was refunded",amount);
  }
}

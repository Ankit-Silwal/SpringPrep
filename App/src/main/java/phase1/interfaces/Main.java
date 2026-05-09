package phase1.interfaces;

public class Main {
  public static void main(String[] args){
    CreditCardPayment cp=new CreditCardPayment();
    cp.pay(3333);
    cp.refund(33);
    UpiPayment up=new UpiPayment();
    up.pay(44);
    up.refund(343);
  }
}

package phase1.accessmodifiers.samepackage;

public class BankAccount {
  private int balance=1000;
  public void showBalance(){
    System.out.println(balance);
  }
//works here sice the class is same
  //static void main(String[] args) {
    //BankAccount b=new BankAccount();
    //System.out.println(b.balance);
  //}
}
class Another{
  BankAccount b=new BankAccount();
//wont work in here since antoehr class
  static void main(String[] args) {
    //System.out.println(b.balance());
    System.out.println("whatever ");
  }
}

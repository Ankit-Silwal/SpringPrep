package phase1.accessmodifiers.samepackage;

public class Main {
  static void main(String[] args) {
    BankAccount b=new BankAccount();
    b.showBalance();
    //wont work cause balance in bank balance is private onyl work on that clas
    //System.out.println(b.balance);
  }
}

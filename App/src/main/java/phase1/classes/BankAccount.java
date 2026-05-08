package phase1.classes;

public class BankAccount {
  private int balance;
  private String owner;
  public BankAccount(String owner){
    this.owner=owner;
  }
  public void deposit(int money){
    balance+=money;
  }
  public void withdraw(int amount){
    if(balance<amount){
      throw new RuntimeException("Insufficient balance");
    }else{
      balance-=amount;
    }
  }
  public void balance(){
    System.out.printf("Balance:%d\n",balance);
  }
}

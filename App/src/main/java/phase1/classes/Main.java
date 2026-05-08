package phase1.classes;

public class Main {
  public static void main(String[] args){
    Student s1=new Student(11,"Ankit",22);
    s1.get();
    s1.setAge(33);
    s1.get();
    s1.setName("Adil");
    s1.get();
    BankAccount ba=new BankAccount(s1.getName());
    ba.deposit(3333);
    ba.balance();

    ba.balance();
    ba.withdraw(1111);
    ba.balance();
  }
}

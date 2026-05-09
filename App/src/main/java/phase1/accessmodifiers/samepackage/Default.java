package phase1.accessmodifiers.samepackage;

public class Default {
  int check=1000;
  public void display(){
    System.out.println(check);
  }
}

class Another2{
  static void main(String[] args) {
    Default d2=new Default();
    d2.display();
    d2.check=11111;
    d2.display();
  }
}
package phase1.accessmodifiers.differentpackage;

import phase1.accessmodifiers.samepackage.Default;

public class Check {
  static void main(String[] args) {
    Default d=new Default();
    d.display();
    //wont work since the default modifier wont let it work
    //d.check=222;
    d.display();
  }
}

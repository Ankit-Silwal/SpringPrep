package phase2.collectionframework.generics;

import java.util.ArrayList;

public class BasicGenerics {
  static void main(String[] args) {
    ArrayList name=new ArrayList();
    name.add("Ankit");
    name.add(19);
    int naam=(Integer) name.get(1);
    System.out.println(naam);
  }
}

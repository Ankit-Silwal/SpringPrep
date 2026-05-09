package phase5.functionalJava.lambdas;

import java.util.ArrayList;

public class LambdaCollection {
  static void main(String[] args) {
    ArrayList<String> names=new ArrayList<>();
    names.add("Ankit");
    names.add("adil");
    names.add("AAryush");

    names.forEach(name-> System.out.println(name));
  }
}

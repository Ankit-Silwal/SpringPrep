package phase5.functionalJava.lambdas;

import java.util.Comparator;

public class LambdasWithParameters {
  static void main(String[] args) {
    Comparator<Integer> comp=(a,b)->a-b;
    System.out.println(comp.compare(10,29));
  }
}


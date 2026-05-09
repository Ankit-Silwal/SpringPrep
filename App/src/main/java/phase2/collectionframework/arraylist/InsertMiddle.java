package phase2.collectionframework.arraylist;

import java.util.ArrayList;

public class InsertMiddle {
  public static void main(String[] argrs){
    ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(30);
    list.add(49);
    System.out.println(list);
    list.add(2,33);
    System.out.println(list);
  }
}

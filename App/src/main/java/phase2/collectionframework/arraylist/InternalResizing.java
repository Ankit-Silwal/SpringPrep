package phase2.collectionframework.arraylist;

import java.util.ArrayList;

public class InternalResizing {
  public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<20;i++){
      list.add(1);
      System.out.println(list.size());
    }
  }
}

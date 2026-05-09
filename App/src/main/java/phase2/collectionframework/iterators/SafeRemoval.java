package phase2.collectionframework.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class SafeRemoval {
  static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(30);
    list.add(33);
    list.add(20);
    list.add(494);
    list.add(44);
    Iterator<Integer> it=list.iterator();
    while(it.hasNext()){
      Integer x=it.next();
      if(x==20){
        it.remove();
      }

    }
    System.out.println(list);
  }
}

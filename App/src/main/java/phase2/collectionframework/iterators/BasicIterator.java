package phase2.collectionframework.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicIterator {
  static void main(String[] args) {
    ArrayList<String> list=new ArrayList<>();
    list.add("Ankit");
    list.add("Adil");
    list.add("Aryal");
    Iterator<String> it= list.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}

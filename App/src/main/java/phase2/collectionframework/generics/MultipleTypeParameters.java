package phase2.collectionframework.generics;

class Pair<K,V>{
  K key;
  V value;
  public Pair(K key,V value){
    this.key=key;
    this.value=value;
  }
  public void display(){
    System.out.println(key+" "+value);
  }
}
public class MultipleTypeParameters {
  static void main(String[] args) {
    Pair<String,Integer> pair=new Pair<>("Age",33);
    pair.display();;
  }
}

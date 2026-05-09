package phase2.collectionframework.generics;
class Box<T>{
  T value;
  public void set(T value){
    this.value=value;
  }
  public T get(){
    return value;
  }
}
public class GenericClass {
  static void main(String[] args) {
    Box<String> box=new Box<>();
    box.set("ankit");
    String value=box.get();
    System.out.println(value);
    Box<Integer> intbox=new Box<>();
    intbox.set(222);
    int val=intbox.get();
    System.out.println(val);
  }
}


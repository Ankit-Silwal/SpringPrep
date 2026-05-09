package phase2.collectionframework.generics;

public class GenericMethod {
  public static <T> void print(T value){
    System.out.println(value+" from the generic thing hehe");
  }

  static void main(String[] args) {
    print("Ankit");
    print(10);
    print(5.5);
  }
}

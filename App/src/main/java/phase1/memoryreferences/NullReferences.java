package phase1.memoryreferences;

public class NullReferences {
  public static void main() {

    Student s1=null;
    //here s1=null means it point to nothing thus null pointer exception will come as the output
    s1.display();
  }
}

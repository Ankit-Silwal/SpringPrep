package phase1.memoryreferences;

public class MethodRessignment {
  public static Student change(Student s){
    s=new Student("new Student");
    return s;
  }

  static void main() {

    Student s=new Student("Ankit");
    s.display();
    s=change(s);
    s.display();
  }
}

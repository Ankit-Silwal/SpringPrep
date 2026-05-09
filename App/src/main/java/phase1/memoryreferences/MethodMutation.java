package phase1.memoryreferences;

public class MethodMutation {
  public static void change(Student s){
    s.name="Changed";
  }

  public static void main() {
    Student s1=new Student("Ankit");
    change(s1);
    s1.display();
  }

}

package phase1.memoryreferences;

public class Reassignment {
  public static void main(String[] args){
    Student s1=new Student("Ankit");
    Student s2=s1;

    //here s2 doesnt modify the already pointed object instead it point the s2 object to the another location
    //s1 was already pointed to the s1 thus no prolem with the s1
    //only the value of s2 gets changed as it points to whole different object

    s2=new Student("Adil");
    s1.display();
    s2.display();
  }
}

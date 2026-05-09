package phase1.memoryreferences;

public class SharedReferences {
  public static void main(String[] args){

    Student s1=new Student("Ankit");
    Student s2=s1;

    //Here the s1 and s2 are the same objects cause s1 and s2 are just references
    //since we do s1=s2 ,they point to the same object thus whenever we change the s1
    //the s2 also get changed with the s1
    s2.name="Adil";
    s1.display();
    s2.display();
  }
}

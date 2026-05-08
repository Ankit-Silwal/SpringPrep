package phase1.constructor;

public class Main {
  public static void main(String[] args){
    Student s1=new Student();
    Student s2=new Student("Test");
    int age2=s2.getAge();
    String name2=s2.getName();
    System.out.printf("Name:%s ,Age:%d \n",name2,age2);
    Student s3=new Student();
    int age3=s3.getAge();
    String name3=s3.getName();
    System.out.printf("Name:%s ,Age:%d \n",name3,age3);
    Student s4=new Student("Ankit",15);
    int age4=s4.getAge();
    String name4=s4.getName();
    System.out.printf("Name:%s ,Age:%d \n",name4,age4);
  }
}

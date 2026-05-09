package phase5.functionalJava.lambdas;

@FunctionalInterface
interface Greeting{
  void sayHello(String hello);
}
public class BasicLambdas  {
  public static void main(String[] args) {

    Greeting g=(String temp)-> System.out.println("Hello "+temp);
    g.sayHello("Ankit");
  }
}

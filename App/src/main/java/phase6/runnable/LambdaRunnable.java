package phase6.runnable;



public class LambdaRunnable {
  static void main(String[] args) {
    Runnable task=()->{
      System.out.println("Lambda thread");
    };
    Thread t1=new Thread(task);
    t1.start();
  }
}

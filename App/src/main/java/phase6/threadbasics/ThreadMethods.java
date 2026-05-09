package phase6.threadbasics;

public class ThreadMethods {
  static void main(String[] args) {
    try {
      MyThread t1=new MyThread();
      t1.start();
      Thread.sleep(222);
      MyThread t2=new MyThread();
      t2.start();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}

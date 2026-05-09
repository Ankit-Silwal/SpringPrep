package phase6.threadbasics;

class MyThread extends java.lang.Thread {
  @Override
  public void run(){
    for(int i=0;i<5;i++){
      System.out.println(Thread.currentThread().getName());
    }
  }
}
public class ThreadDemo{
  static void main(String[] args) {
    MyThread t1=new MyThread();
    t1.start();
    for(int i=1;i<=5;i++){
      System.out.println("Main Thread:"+i);
    }
  }
}

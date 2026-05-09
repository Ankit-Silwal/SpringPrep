package phase6.runnable;

class MyTask implements Runnable{
  @Override
  public void run(){
    for(int i=1;i<=5;i++){
      System.out.println("Task running "+i);
    }
  }
}
public class BasicRunnable {
  static void main(String[] args) {
    MyTask task=new MyTask();
    Thread t1=new Thread(task);
    t1.start();
  }
}

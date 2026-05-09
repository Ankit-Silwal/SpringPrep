package phase6.runnable;

class CounterTask implements Runnable{
  @Override
  public void run(){
    for(int i=1;i<=3;i++){
      System.out.println(Thread.currentThread().getName()+" "+i);
    }
  }
}
public class MultipleRunnable {
  static void main(String[] args) {
    CounterTask task=new CounterTask();
    Thread t1=new Thread(task);
    Thread t2=new Thread(task);
    t1.start();
    t2.start();
  }
}

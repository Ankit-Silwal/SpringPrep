package phase6.racecondition;

public class RaceConditionDemo {
  static void main(String[] args) throws InterruptedException{
    Couter counter=new Couter();
    Runnable task=()->{
      for(int i=0;i<1000;i++){
        counter.increment();
      }
    };
    Thread t1=new Thread(task);
    Thread t2=new Thread(task);
    t1.start();
    t2.start();

    t1.join();
    t2.join();
    System.out.println(counter.count);
  }
}

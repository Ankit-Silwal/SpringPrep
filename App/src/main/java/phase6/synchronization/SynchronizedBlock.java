package phase6.synchronization;

public class SynchronizedBlock {
  int count=0;
  public void increment(){
    synchronized (this){
      count++;
    }
  }
}

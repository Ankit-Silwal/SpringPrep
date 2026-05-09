package phase6.synchronization;

public class StaticSynchronization {
  static int count=0;
  public static synchronized void increment(){
    count++;
  }
}

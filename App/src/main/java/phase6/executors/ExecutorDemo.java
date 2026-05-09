package phase6.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
  static void main(String[] args) {
    ExecutorService executor= Executors.newFixedThreadPool(2);
    Runnable task=()->{
      System.out.println(Thread.currentThread().getName());
    };
    executor.execute(task);
    executor.execute(task);
    executor.execute(task);
    executor.shutdown();
  }
}

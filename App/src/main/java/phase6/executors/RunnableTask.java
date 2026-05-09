package phase6.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTask {
  static void main(String[] args) {
    ExecutorService executor= Executors.newFixedThreadPool(3);
    for(int i=1;i<=5;i++){
      int taskId=1;
      executor.execute(()->{
        System.out.println("Task"+" "+taskId+" "+Thread.currentThread().getName());
      });
    }
    executor.shutdown();
  }
}

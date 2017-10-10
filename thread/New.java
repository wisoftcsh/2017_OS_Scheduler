package fifo_scheduler.thread;

import fifo_scheduler.service.ProcessService;

import java.util.Random;

public class New extends Thread {
  public New(){}

  @Override
  public void run() {
    try {
      for(int i = 0 ; i < 5; i ++){
        System.out.println("프로세스 생성중...");
        Thread.sleep((new Random().nextInt(10)) * 1000);
        ProcessService.enReadyQueueProcess();
        System.out.println("프로세스 Ready Queue에 저장");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
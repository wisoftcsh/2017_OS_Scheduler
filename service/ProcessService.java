package fifo_scheduler.service;

import fifo_scheduler.resource.Process;
import fifo_scheduler.resource.Resource;

import java.util.Random;

public class ProcessService implements Service {
  public static void enReadyQueueProcess() {
    Random random = new Random();
    Resource.readyQueue.offer(new Process(random.nextInt(1000), random.nextInt(20)+1,
        random.nextInt(10), System.currentTimeMillis()));
  }

  public static Process startProcess() {
    Process process = Resource.readyQueue.poll();
    System.out.println("현재 실행 중인 프로세스의 버스트 타임 : " + process.getBurstTime());
    process.setDequeueTime(System.currentTimeMillis());
    return process;
  }

  public static void endProcess(Process process) {
    process.setEndTIme(System.currentTimeMillis());
  }

  public static void calculateTunroundTime(Process process) {
    process.setTurnAroundTime(((process.getEndTIme() - process.getDequeueTime())
      + (process.getDequeueTime() - process.getEnqueueTime())) / 1000);
  }

  @Override
  public void service(){}
}

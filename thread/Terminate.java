package fifo_scheduler.thread;

import fifo_scheduler.resource.Process;

public class Terminate extends Thread {
  private Process process;

  public Terminate(Process process) {
    this.process = process;
  }

  @Override
  public void run() {
    System.out.println(process + " 프로세스 종료");
    System.out.println("생성 시간 : " + process.getEnqueueTime());
    System.out.println("시작 시간 : " + process.getDequeueTime());
    System.out.println("종료 시간 : " + process.getEndTIme());
    System.out.println("반환 시간 : " + process.getTurnAroundTime());
  }
}

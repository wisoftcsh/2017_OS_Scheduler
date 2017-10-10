package fifo_scheduler.thread;

import fifo_scheduler.resource.Resource;
import fifo_scheduler.service.ProcessService;
import fifo_scheduler.cpu.CPU;

public class Ready extends Thread {
  private CPU cpu;

  public Ready(CPU cpu) {
    this.cpu = cpu;
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(500);
        if ((!Resource.readyQueue.isEmpty()) && cpu.getState().equals("WAIT")) {
          System.out.println("Ready Queue에서 프로세스 선택 중...");
          cpu.setProcess(ProcessService.startProcess());
          cpu.setState("RUNNING");
          System.out.println("적재 완료");
        } else if (cpu.getState().equals("WAIT")) {
          System.out.println("CPU 대기 중..");
        } else {
          System.out.println("CPU 사용 중..");
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}

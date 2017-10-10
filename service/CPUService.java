package fifo_scheduler.service;

import fifo_scheduler.cpu.CPU;
import fifo_scheduler.resource.Process;
import fifo_scheduler.thread.Terminate;

public class CPUService implements Service {
  public static void running(Process process, CPU cpu) {
    try {
      process.setBurstTime(process.getBurstTime() - 1);
      if (process.getBurstTime() == 0) {
        ProcessService.endProcess(process);
        ProcessService.calculateTunroundTime(process);
        cpu.setState("WAIT");
        Terminate terminate = new Terminate(process);
        terminate.start();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void service() {
  }
}

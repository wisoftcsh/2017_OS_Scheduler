package fifo_scheduler.thread;

import fifo_scheduler.cpu.CPU;
import fifo_scheduler.service.CPUService;

public class Running extends Thread {
  private CPU cpu;

  public Running(CPU cpu) {
    this.cpu = cpu;
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(1000);
        if (cpu.getState().equals("RUNNING")) {
          CPUService.running(cpu.getProcess(), cpu);
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

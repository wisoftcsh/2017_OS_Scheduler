package fifo_scheduler;

import fifo_scheduler.cpu.CPU;
import fifo_scheduler.service.Scheduler;
import fifo_scheduler.thread.New;

public class Main {
  public static void main(String[] args) {
    New newProcess = new New();
    newProcess.start();

    CPU cpu = new CPU();
    Scheduler scheduler = new Scheduler(cpu);
    scheduler.start();
  }
}

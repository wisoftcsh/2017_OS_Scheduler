package fifo_scheduler.service;

import fifo_scheduler.cpu.CPU;
import fifo_scheduler.thread.Ready;
import fifo_scheduler.thread.Running;

public class Scheduler extends Thread {
  private CPU cpu;
  private Ready ready;
  private Running running;

  public Scheduler(CPU cpu) {
    this.cpu = cpu;
    ready = new Ready(cpu);
    running = new Running(cpu);
  }

  @Override
  public void run() {
      ready.start();
      running.start();
  }
}

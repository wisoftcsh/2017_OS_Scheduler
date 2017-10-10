package fifo_scheduler.cpu;

import fifo_scheduler.resource.Process;

public class CPU {
  private String state;
  private Process process;

  public CPU(){
    state = "WAIT";
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Process getProcess() {
    return process;
  }

  public void setProcess(Process process) {
    this.process = process;
  }
}

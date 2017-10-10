package fifo_scheduler.resource;

public class Process {
  private final int pid;
  private int burstTime;
  private int priority;
  private long enqueueTime;
  private long dequeueTime;
  private long endTIme;
  private long turnAroundTime;

  public Process(final int pid, int burstTime, int priority, long enqueueTime) {
    this.pid = pid;
    this.burstTime = burstTime;
    this.priority = priority;
    this.enqueueTime = enqueueTime;
  }

  public int getPid() {
    return pid;
  }

  public int getBurstTime() {
    return burstTime;
  }

  public int getPriority() {
    return priority;
  }


  public long getEnqueueTime() {
    return enqueueTime;
  }

  public void setEnqueueTime(long enqueueTime) {
    this.enqueueTime = enqueueTime;
  }

  public long getDequeueTime() {
    return dequeueTime;
  }

  public void setDequeueTime(long dequeueTime) {
    this.dequeueTime = dequeueTime;
  }

  public long getEndTIme() {
    return endTIme;
  }

  public void setEndTIme(long endTIme) {
    this.endTIme = endTIme;
  }

  public long getTurnAroundTime() {
    return turnAroundTime;
  }

  public void setTurnAroundTime(long turnAroundTime) {
    this.turnAroundTime = turnAroundTime;
  }

  public void setBurstTime(int burstTime) {
    this.burstTime = burstTime;
  }
}

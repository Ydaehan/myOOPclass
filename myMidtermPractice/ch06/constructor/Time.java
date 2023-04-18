package myMidtermPractice.ch06.constructor;

public class Time {
  private int hour, minute, second;
  
  public Time(){
    this(0,0,0);
  }

  public Time(int h, int m, int s){
    hour = ((h >= 0 && h < 24) ? h : 0);
    minute = ((m >= 0 && m < 60) ? m : 0);
    second = ((s >= 0 && s < 60) ? s : 0);
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}

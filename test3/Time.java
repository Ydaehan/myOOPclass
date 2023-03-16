package test3;

public class Time {
  private int hour, minute, second;

  // first Constructor
  public Time(){
    this(0,0,0);
  }

  // second Constructor
  public Time(int argHour, int argMinute, int argSecond){
    hour = ((argHour >= 0 && argHour < 24) ? argHour : 0);          // 시간 검증
    minute = ((argMinute >= 0 && argMinute < 60) ? argMinute : 0);  // 분 검증
    second =((argSecond >= 0 && argSecond < 60) ? argSecond : 0);   // 초 검증
  }

  // "시:분:초"의 형식으로 출력
  public String toString(){
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}

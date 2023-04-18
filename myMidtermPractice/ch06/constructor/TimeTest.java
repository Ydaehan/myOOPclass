package myMidtermPractice.ch06.constructor;

public class TimeTest {
  public static void main(String[] args) {
    Time time1, time2, time3;
    time1 = new Time();
    time2 = new Time(13, 27, 6);
    time3 = new Time(99, 66, 77);
    System.out.println("기본 생성자 호출 후 시간 : " + time1.toString());
    System.out.println("두번째 생성자 호출 후 시간 : " + time2.toString());
    System.out.println("올바르지 않은 시간 설정 후 시간 : " + time3.toString());
    
  }
}

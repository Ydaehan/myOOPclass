package test3;

public class TimeTest {
  public static void main(String[] args) {
    // Time 객체를 생성하고 초기화한다.
    Time time = new Time();
    System.out.println("기본 생성자 호출 후 시간: " + time.toString());

    // 두 번째 생성자 호출
    Time time2 = new Time(13,27,6);
    System.out.println("두 번째 생성자 호출 후 시간: " + time2.toString());

    // 올바르지 않는 시간으로 설정해본다.
    Time time3 = new Time(99, 66, 77);
    System.out.println("올바르지 않은 시간 설정 후 시간: " + time3.toString());
  }
}

package myMidtermPractice.ch06.staticMethod;

public class Car {
  private String model, color;
  private int speed;

  // 자동차의 시리얼 번호
  private int id;
  // 실체화 된 Car 객체의 개수를 위한 정적 변수
  static int numbers = 0;

  public Car(String m, String c, int s){
    model = m;
    color = c;
    speed = s;
    // 자동차의 개수를 증가 시키고 id에 대입한다.
    id = ++numbers;
  }

  // 정적 메소드
  public static int getNumberOfCars(){
    return numbers;
  }
  // 정적메소드에서는 인스턴스 변수와 인스턴스 메소드에 접근할 수 없다.
}

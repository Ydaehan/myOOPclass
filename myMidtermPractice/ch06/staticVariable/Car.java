package myMidtermPractice.ch06.staticVariable;

public class Car {
  private String model, color;
  private int speed;

  // 자동차의 시리얼 번호
  private int id;
  static int numbers = 0;

  public Car(String m, String c, int s){
    model = m;
    color = c;
    speed = s;
    // 자동차의 개수를 증가 시키고 id에 대입한다.
    id = ++numbers;
  }
}

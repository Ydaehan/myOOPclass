package myMidtermPractice.ch06.primitiveType;

public class MyCounterTest {
  public static void main(String[] args) {
    MyCounter obj = new MyCounter();
    int x = 10;

    obj.inc(x);
    System.out.println("x = " + x);
    // x 값을 증가시키는 함수를 실행 했음에도 불과하고 x의 값은 여전히 10이다
    // 이 경우 값의 변화를 시켜 주기 위해서는 obj.inc(x) 의 값을 받아올 다른 변수를 만들거나
    // 기존 x의 값을 변화 시켜야 한다.
    // 그러기 위해서는 MyCounter class의 inc method에 return을 시켜 주어야한다.
  }
}

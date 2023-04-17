package myMidtermPractice.ch06.constructor;

public class MyCounterTest {
  public static void main(String[] args) {
    MyCounter obj1,obj2;
    // default 생성자 호출
    // obj1 = new MyCounter();
    // obj2 = new MyCounter();

    // 매개변수를 가진 생성자 호출
    obj1 = new MyCounter(100);
    obj2 = new MyCounter(200);

    System.out.println("객체 1의 counter = " + obj1.counter);
    System.out.println("객체 2의 counter = " + obj2.counter);
  }
}

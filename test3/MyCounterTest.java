package test3;

public class MyCounterTest {
  public static void main(String[] args) {
    // 매개변수를 가진 생성자의 호출
    // MyCounter obj1 = new MyCounter(100);
    // MyCounter obj2 = new MyCounter(200);
    // System.out.println("객체 1의 counter = " + obj1.counter);
    // System.out.println("객체 2의 counter = " + obj2.counter);
    MyCounter obj = new MyCounter();
    int x = 10;
    obj.inc(x);
    System.out.println("x = " + x);
  }
}

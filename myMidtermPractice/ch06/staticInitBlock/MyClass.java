package myMidtermPractice.ch06.staticInitBlock;

public class MyClass {
  static int x;
  int y;

  static {
    x = 10;
    System.out.println("정적 블록 호출");
  }
}

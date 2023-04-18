package myMidtermPractice.ch06.staticInitBlock;

public class MyClassTest {
  public static void main(String[] args) {
    // 정적 변수가 사용되기 때문에 정적 블록에 의하여 초기화 된다.
    System.out.println(MyClass.x);
  }
}

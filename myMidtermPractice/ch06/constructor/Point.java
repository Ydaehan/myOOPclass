package myMidtermPractice.ch06.constructor;

public class Point {
  private int x = 0;
  private int y = 0;

  // constructor
  // public Point(int a, int b){
  //   x = a;
  //   y = b;
  // }

  // 위 와 같이 x 와 y를 직접 사용할 수 도 있지만

  public Point(int a, int b){
    this.x = a;
    this.y = b;
  }
  // 이 처럼 사용 할 수도 있다.
}

package myMidtermPractice.ch06.constructor;

public class Point2 {
  public int x, y;
  public Point2(int a, int b){
    x = a;
    y = b;
  }

  @Override
  public String toString() {
    return "Point  [x=" + x + ", y=" + y + "]";
  }
}

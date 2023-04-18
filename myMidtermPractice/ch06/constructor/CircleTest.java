package myMidtermPractice.ch06.constructor;

public class CircleTest {
  public static void main(String[] args) {
    Point2 p = new Point2(25, 78);
    Circle c = new Circle(p, 10);
    System.out.println(c);
  }
}

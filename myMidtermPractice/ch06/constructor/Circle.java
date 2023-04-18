package myMidtermPractice.ch06.constructor;

public class Circle {
  private int radius;
  private Point2 center;

  public Circle(Point2 p, int r){
    center = p;
    radius = r;
  }
  @Override
  public String toString() {
    return "Circle [radius=" + radius + ", center=" + center + "]";
  }
}

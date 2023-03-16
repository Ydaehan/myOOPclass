package test3;

public class Circle {
  private Point p;
  private int radius;

  public Circle(Point argP, int argRadius){
    p = argP;
    radius = argRadius;
  }

  @Override
  public String toString(){
    return "기준점:" + p + ", 반지름:" + radius;
  }

  public static void main(String[] args) {
    Point p = new Point(10, 15);
    Circle c = new Circle(p, 10);

    System.out.println(p + "\n" + c);
    /* Java 에서 모든 class 의 조상은 Object 이기 때문에
     * 부모인 Object 형으로 받기 때문에 p 와 c 를 받을 수 있다.
     */
  }
}

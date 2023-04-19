package interfaceTest;

public class Rectangle implements Comparable{
  private int width, height;
  @Override
  public String toString() {
    return "Rectangle [width=" + width + ", height=" + height + "]";
  }

  public Rectangle(int w, int h){
    width = w;
    height = h;
    System.out.println(this);
  }

  public int getArea() {
    return width * height;
  }

  // interface 의 abstract method 를 구현
  @Override
  public int compareTo(Object other) {
    Rectangle otherRect = (Rectangle) other;
    if (this.getArea() < otherRect.getArea())
      return -1;
    else if (this.getArea() > otherRect.getArea())
      return 1;
    else
      return 0;
  }
}

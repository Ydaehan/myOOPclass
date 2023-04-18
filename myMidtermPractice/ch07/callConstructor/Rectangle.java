package myMidtermPractice.ch07.callConstructor;

public class Rectangle extends Shape{
  private int width, height;

  public Rectangle(int x, int y, int width, int height){
    super(x, y);
    System.out.println("Rectangle()");
    this.width = width;
    this.height = height;
  }

  double calcArea() {
    return width * height;
  }
}

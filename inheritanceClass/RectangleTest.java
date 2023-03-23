package inheritanceClass;

public class RectangleTest {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();

    r1.setXY(5, 3);
    r1.setWidthHeight(10, 20);

    r2.setXY(8, 9);
    r2.setWidthHeight(15, 20);

    r1.print();
    r1.draw();
    System.out.println("----------------------------");
    r2.print();
    r2.draw();
  }
}

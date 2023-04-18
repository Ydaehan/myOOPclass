package myMidtermPractice.ch06.boxSizeCheck;

public class BoxTest {
  public static void main(String[] args) {
    boolean result;
    Box box1, box2;
    box1 = new Box(10, 20, 30);
    box2 = new Box(20, 10, 30);

    result = box1.isSameBox(box2);
    System.out.println("box1 == box2 : " + result);
  }
}

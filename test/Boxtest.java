package test;
public class Boxtest {
  public static void main(String[] args) {
 /* Box obj1 = new Box(10, 20, 50);
    Box obj2 = new Box(10,30,30);

    Box largest = obj1.whosLargest(obj1, obj2);
    System.out.println("("+largest.width + "," + largest.length + "," + largest.height + ")"); */

    Box obj1 = new Box(10, 20, 50);
    Box obj2 = new Box(10, 20, 50);

    System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
  }
}

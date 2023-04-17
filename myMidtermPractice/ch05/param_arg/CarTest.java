package myMidtermPractice.ch05.param_arg;

public class CarTest {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.changeGear(1);
    myCar.speedUp();
    System.out.println(myCar);
  }
}

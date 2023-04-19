package interfaceTest;

public class AutoCarTest {
  public static void main(String[] args) {
    AutoCar c1 = new AutoCar();
    c1.start();
    c1.setSpeed(30);
    c1.turn(15);
    c1.stop();
  }
}

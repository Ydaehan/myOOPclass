package myMidtermPractice.ch05.param_arg;

public class Car {
  String color;
  int speed, gear;

  @Override
  public String toString() {
    return "Car [color="+ color +", speed=" + speed +", gear=" + gear + "]";
  }

  void changeGear(int g){
    gear = g;
  }

  void speedUp() {
    speed = speed + 10;
  }

  void speedDown() {
    speed = speed - 10;
  }
}

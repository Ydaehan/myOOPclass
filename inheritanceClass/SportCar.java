package inheritanceClass;

public class SportCar extends Car {
  private boolean turbo;

  public boolean isTurbo(){
    return turbo;
  }

  public void setTurbo(boolean argTurbo){
    turbo = argTurbo;
  }

  @Override
  public String toString(){
    return "speed[" + getSpeed() + "], turbo[" + isTurbo() + "]";
  }
}

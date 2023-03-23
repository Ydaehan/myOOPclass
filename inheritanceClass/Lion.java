package inheritanceClass;

public class Lion extends Animal {
  private int legs = 4;

  public int getLegs() {
    return legs;
  }

  public void setLegs(int argLegs) {
    legs = argLegs;
  }

  public void roar() {
    System.out.println("roar()가 호출되었음");
  }
}

package inheritanceClass;

public class Eagle extends Animal{
  private int wings = 2;

  public int getWings() {
    return wings;
  }

  public void setWings(int argWings){
    wings = argWings;
  }

  public void fly() {
    System.out.println("fly()가 호출 되었음");
  }
}

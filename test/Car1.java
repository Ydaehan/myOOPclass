package test;

public class Car1 {
  private int speed;
  private String name;

  public Car1() {
    System.out.println("속도는 " + speed);
  }

  // 인스턴스 초기화 블록(instance initialization block)
  { // 초기화 블록은 자동으로 생성자에게 copy 가 됨
    // 오버로딩 된 생성자에게도 copy되어 실행됨
    speed = 100;
    // 다른 생성자를 호출 하였을 때에도 실행되어야 할때 사용 
    // (공통적으로 필요한 초기화 코드를 정의 할 수 있다.)
  }

  public Car1(String argName){
    name = argName;
    System.out.println("속도는 " + speed);
  }
  public static void main(String[] args){
    Car1 c1 = new Car1();
    Car1 c2 = new Car1("그랜져");
  }
}

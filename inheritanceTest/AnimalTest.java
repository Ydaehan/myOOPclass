package inheritanceTest;

import inheritanceClass.Eagle;

public class AnimalTest {
  public static void main(String[] args) {
  // eat() 과 sleep() method 는 각각 protected , default 접근 제어자로 되어 있다.
  // protected 인 eat()은 같은 패키지 내 클래스 내부와 자식 클래스에서 접근이 가능하지만
  // 다른 패키지인 inheritanceTest 패키지에서는 사용이 불가 하다. => 같은 패키지가 아니기 때문

  // default 형식인 sleep()은 같은 패키지 내 클래스 내부에서만 접근이 가능하기 때문에
  // 다른 패키지에 있는 클래스에서는 접근이 불가능 하다
  

    Lion lion = new Lion();
    // lion.eat();
    // lion.sleep();
    // roar() 는 접근 제어자가 public 이기 때문에 다른 패키지 에서도 접근이 가능한 것
    lion.roar();
    System.out.println("\n----------------------\n");
    Eagle eagle = new Eagle();
    // eagle.eat();
    // eagle.sleep();
    // eagle.sleep();
  }
}

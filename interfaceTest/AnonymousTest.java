package interfaceTest;


public class AnonymousTest {
  public static void main(String[] args) {
    RemoteControl rt1 = new SamsungTV();
    rt1.turnOff();

    RemoteControl rt2 = new LgTV();
    rt2.turnOn();

    // 무명 클래스로 SonyTV 객체를 만들어 보자
    // 무명 클래스는 클래스를 정의하면서 동시에 객체를 생성한다
    // 이름이 없기 때문에 한번만 사용이 가능하다.
    RemoteControl rt3 = new RemoteControl() {

      @Override
      public void turnOn() {
        System.out.println("Sony TV를 켭니다");
      }

      @Override
      public void turnOff() {
        System.out.println("Sony TV를 끕니다");
      }
      // 보통의 인터페이스와 클래스를 선언할 때는
      // ;을 붙이지 않지만 
    };  // 이것은 클래스 선언과 동시에 객체를 생성하는 
        // 표현식 이기 때문에 ; 을 붙여야함

    rt3.turnOn();
    rt3.turnOff();

    // 여기서 문제. Student class 를 상속받는 무명클래스를 생성하고
    // 이름을 출력해보시오.
    // 무명 클래스의 한계
    //  - 무명 클래스를 만들 때(아래 부모클래스 이름은 인터페이스 이름을 포함한 용어)
    // new 부모클래스이름(부모클래스의 생성자에게 전달할 인자 리스트) {클래스 정의}
    // 무명 클래스를 만들 때는 제약이 있는데, 새로운 생성자를 정의할 수 없다.
    // class GradStudent extends Student { public GradStudent(...){...}; }
    // 무명이 아닌 위 와같은 이름이 있는 클래스로 정의하면 생성자를 가질 수 있지만
    // 무명클래스는 이름이 없는  클래스이기 때문에 생성자를 만들 수 없다.
    Student std1 = new Student("유대한", "컴정") {
      // 무명 클래스는 생성자를 정의할 수없다.
      // 왜? 생성자는 클래스 이름과 같아야하는데 , 무명클래스는 클래스 이름이 없다.
      // 그렇다고 부모 클래스 이름으로 생성자를 만들 수도 없다.
      // public Student() {} X
      public void sayHello(){
        System.out.println("안녕하세요");
        System.out.println(getName());
      }

      @Override
      public String toString() {
        return "Name : " + getName();
      }
    };

    System.out.println(std1);
    // System.out.println(std1.sayHello());
    // 무명클래스에서 새로 정의한 메서드는 호출조차 할 수 없다.
    // 무명클래스에서 새로 정의한 메서드는 해당 무명클래스 내부에서만 사용할 수 있다.
    System.out.println("Name : " + std1.getName());
  }

  
}

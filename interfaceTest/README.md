# Interface
- `abstract` method 만 가진다
- Instance를 만들 수 없다
- class 처럼 data type으로 사용될 수 있다
- `implements` keyword를 사용해 interface를 구현하는 class를 정의한다
  **이 때 interface의 모든 `abstract` method는 반드시 구현되어야 한다**
- `abstract` 와 유사 
  쓰임새가 다르다

- `abstract class` => 추상 메소드와 일반 메소드 둘 다 가질 수 있다
- `interface` => 추상 메소드 만 가진다
- class간 상호작용하기 위한 약속(계약)
- 상호 작용할 class가 구현되지 않아도 그 class와 상호작용할 다른 class를 구현할 수 있게 해 줌
- Java 8 부터는 구현을 가지는 `default method` 와 `static method`를 가질 수 있다.
- `interface AdvancedRemoteControl extends RemoteControl` <br>
**인터페이스가 인터페이스를 상속 받을 때는 implements 가 아닌 extends를 사용한다**
- `class TvRemoteControl implements AdvancedRemoteControl` <br>
**클래스에 인터페이스를 상속 시킬 때는 extends 가 아닌 implements를 사용하여아 한다.**

<aside>
⭐ **Thread(쓰레드)**

- **실행의 흐름(Execution Flow)을 의미**

```java
class ClassName {
	public static void main(String[] args) {
		// 위에서 아래로
			// 이것이 실행의 흐름이다.
	}
}
```

**Java 에서 Multithread 와 Singlethread는 Programing 에서의 thread의 개수를 의미한다**

### **Single Thread**

- **Program이 하나의 Thread에서 작동하는 것을 의미한다**
    - **이 경우, Program은 한 번에 하나의 작업만 수행 할 수 있으며, 다른 작업이 실행되기 전에 이전 작업이 완료되어야 한다.**
    - **이러한 모델은 간단하고 구현하기 쉽지만, 대규모 응용프로그램에서는 성능과 사용자 경험 측면에서 한계가 있을 수 있다.**

### **MultiThread**

- **하나의 Program 이 여러 개의 Thread에서 작동하는 것을 의미한다**
- **각 `Thread`는 프로그램의 일부를 병렬로 실행하며, 이로 인해 동시에 여러 작업이 실행 될 수 있다.**
- `**MultiThead Model`은 여러 작업이 서로 간섭하지 않고 병렬로 실행될 수 있으므로 대규모 응용 프로그램에서 성능 향상을 가져 올 수 있다.**
    - **그러나 `MultiThread`는 `Thread` 간 `동기화`  및 `교착상태(DeadLock)`등의 문제를 해결해야 할 수 있다.**

**자바에서는 `MultiThread` 를 구현하기 위해 `java.lang.Thread class` 와  `java.util.concurrent Package`의 도구들을 제공한다.**

- **이를 통해 `MultiThread Application`을 개발 할 수 있다.**
- **또한, 자바에서는 `Thread`를 안전하게 사용하기 위한 `동기화 메커니즘과 스레드 간 통신 방법` 등을 제공한다.**

`**MultiThread`는 `Program`의 성능을 향상 시킬 수 있으며, 대규모 응용 프로그램에서는 거의 필수적이다.**

**그러나 `Thread` 간 동기화와 교착 상태(DeadLock) 등의 문제를 해결해야 하므로, 프로그래머는 `MultiThread Application`을 설계하고 구현하는 데 주의해야한다.**

</aside>

## **예제**

```java
**package interfaceTest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // ActionListener 라는 인터페이스를 사용할수 있게 해주는 라이브러리
import javax.swing.Timer; // Timer 함수를 사용 할수 있게 해주는 라이브러리

class MyClass implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Beep");
  }
}

public class CallBackTest {
  public static void main(String[] args) {
    MyClass listener = new MyClass(); 
    // ActionListener Type이 아닌 
    // implements 클래스의 타입으로도 받아도 상관없다 (다형성)
    Timer timer = new Timer(1000, listener);
    timer.start(); // timer를 불러주어야 listener의 Action perform을 불러준다
    for (int i = 0; i < 1000; i++){
      try{
        Thread.sleep(1000);
      } catch(InterruptedException e) {
      }
    }
  }
}**
```

<aside>
⭐ **위 코드는 `Java Swing Library`를 사용하여 `Timer Class`를 사용하는 CallBack 기능을 구현한 예제다**

`**MyClass` Class는 `ActionListener Interface`를 구현하여 `actionPerformed()` method를 오버라이드함**

`**actionPerformed()` method는 `Timer` 객체에 의해 호출되며, “Beep”을 출력하는 기능을 수행한다.**

`**CallBackTest` Class는 `main()` method 에서 `MyClass` 객체와 `Timer` 객체를 생성한다.**

**Timer 객체는 1초마다 ActionListener 객체인 MyClass를 호출하며, “Beep”을 출력, 그리고 1000번 반복하는 for 루프를 통해 Timer 객체가 동작하는 동안 `main()` Thread를 대기시킨다.**

**이렇게 구현된 콜백(callback)기능은 사용자의 이벤트를 처리하기 위해 자주 사용되는 방법 중 하나이다. 이 예제에서는 `Timer Class`를 사용하여 주기적으로 `actionPerformed() method`를 호출 하였지만, 사용자의 마우스 클릭, 키보드 입력등의 이벤트에 대해서도 이와 같은 방식으로 `콜백(callback)`을 사용할 수 있다.**

</aside>

## **다중 상속**

<aside>
⭐ **다중 상속(Multiple inheritance)은 하나의 클래스가 여러 개의 부모 클래스를 가지는 것이다.**

**예를 들어서 하늘을 나는 자동차는 자동차의 특성도 가지고 있지만 비행기의 특징도 가지고 있다.**

- **다중 상속이란 여러 개의 수퍼 클래스로부터 상속하는 것**
- **자바에서는 다중 상속을 지원하지 않는다**
- **다중 상속에는 어려운 문제가 발생한다**
- **인터페이스를 이용하면 다중 상속의 효과를 낼 수 있다.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2ed2c2fc-27a7-4287-a713-1fefd53f07ec/Untitled.png)

- **인터페이스에는 상수를 정의할 수 있다. ( 인터페이스의 멤버 변수들은 모두 public static Final이 앞에 붙어서 자동으로 상수가 된다.)**
    - **인터페이스 내에서 선언된 모든 변수는 public static final로 선언되기 때문에, 변수의 값은 변경될 수 없는 상수(constant)로 취급된다.**
        - **따라서 인터페이스 내에서 선언된 변수의 이름은 관례적으로 대문자와 언더스코어(_)를 조합하여 표현한다**

## **예제**

```java
**package interfaceTest;

public interface Direction {
	// 인터페이스는 기본적으로 모든 멤버 변수들이 앞에 public static final이 붙어
	// 모든 변수가 상수로 정의된다.

  int NORTH = 4;
  int SOUTH = 3;
  int EAST = 2;
  int WEST = 1;
}**
```

```java
**package interfaceTest;

public class DirectionTest implements Direction{
  public static void main(String[] args) {
    System.out.println("North: " + Direction.NORTH);
    System.out.println("South: " + Direction.SOUTH);
    // Direction.EAST = 100; // 상수이기 때문에 값을 변경할 수 없다.

    // Direction Interface를 구현하면, 나의 상수인 것 처럼
    // 그냥 아래와 같이 사용할 수 있다.
    System.out.println("EAST: " + EAST);
  }
}**
```

### **디폴트 메소드**

- **디폴트 메소드(default method)는 인터페이스 개발자가 메소드의 디폴트 구현을 제공할 수 있는 기능이다.**

### **정적 메소드**

- **인터페이스는 전통적으로 추상적인 규격이기 때문에 정적 메소드(static method)가 들어간다는 것은 처음에는 생각할 수도 없었다. 하지만 시대가 변했다. 최근에 인터페이스에서도 정적 메소드가 있는 것이 좋다고 간주되고 있다.**
</aside>

## 무명 클래스

<aside>
⭐ 무명 클래스(anonymous class)는 클래스 몸체는 정의되지만 이름이 없는 클래스이다.

- 무명 클래스는 클래스를 정의하면서 동시에 객체를 생성하게 된다
- 이름이 없기 때문에 한번만 사용이 가능하다.

## 예제

```java
**package interfaceTest;

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
      /*이쪽 시험에 나오니깐 외워라 <무명 클래스의 특징>*/

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
}**
```
</aside>

- 무명 클래스는 GUI프로그래밍을 할 때 자주사용된다.

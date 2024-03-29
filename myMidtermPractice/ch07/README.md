# 상속
## 상속의 개념
**상속(inheritance)**
- 기존에 존재하는 클래스로부터 **코드와 데이터를 이어받고 자신이 필요한 기능을 추가하는 기법**
- 소프트 웨어를 **재사용**할 수 있어서 **신뢰성있는 소프트 웨어를 손쉽게 개발, 유지 보수를 가능케해주는 중요한 기술**
- 여러 클래스의 공통적인 코드들을 하나의 클래스로 모을 수 있어서 **코드의 중복을 줄일 수 있다**

### 상속의 형식
- 클래스 이름 뒤에 `extends` 를 사용하여 뒤에 부모 클래스 이름을 적어주면 된다.
- 부모 클래스를 확장하여서 자식 클래스를 작성한다는 의미
- 구조
- `class Childclass extends Parentsclass`
  `{`

  `}`
**다중 상속은 허용하지 않는다**
- 자바에서는 다중 상속을 허용하지 않는다
- *두개 이상의 부모 클래스로부터 상속을 받는 것을 의미한다*
- C++에서는 다중 상속을 허용하지만 자바에서는 오직 단일 상속만 가능하다
- 하지만 자바에서는 `인터페이스`를 사용하여서 다중 상속의 효과를 낼 수 있다

## 상속과 접근 제어
- 상속 시킬 멤버와 상속 시키지 않을 멤버를 지정할 수 있다
- 자식 클래스는 부모 클래스의 `public member`, `protected member`, `package member`(부모 클래스와 자식 클래스가 같은 패키지에 있다면)를 상속받음
- 상속되지 않는 것도 있다
- 부모클래스의 `private member`는 상속되지 않음
- 부모클래스와 자식 클래스만 사용하는 필드를 만들려면 변수 선언시에 `protected`를 앞에 붙이면 된다

## 메소드 오버라이딩
- 자식 클래스에서는 부모 클래스의 메소드 중에서 필요한 것을 다시 정의할 수 있다
  => 이것을 **자식 클래스의 메소드가 부모 클래스의 메소드를 오버라이드(재정의)한다** 고 한다
- 오버라이드(override)는 무시한다는 의미이다.
- 상속에서 부모 클래스의 메소드를 변경하는 것이 필요할 때 사용
  **이 때 메소드의 이름이나 매개 변수, 반환형은 동일하여야 한다.**

### 키워드 super를 사용하여 부모 클래스 접근
- 키워드 super는 **상속 관계에서 부모 클래스의 메소드나 필드를 명시적으로 참조**하기 위하여 사용
- 만약 부모 클래스의 메소드나 필드를 오버라이드 한 경우 `super`를 사용하면 부모 클래스의 메소드나 필드를 호출할 수 있다.

## 상속과 생성자
- 자식 클래스의 객체가 생성될 때, 생성자는 어떻게 호출될까?
  => **부모 클래스의 생성자가 먼저 불린 후 자식 클래스의 생성자가 호출된다.**

### 명시적인 호출
- `super`라는 키워드로 호출

### 묵시적인 호출
- 자바에서는 명시적으로 부모 클래스의 생성자를 호출해주지 않아도 자식 클래스의 객체가 생성될 때 자동적으로 부모 클래스의 매개 변수가 없는 생성자가 호출된다.

## 추상 클래스
- 완전하게 구현되지 않은 메소드를 가지고 있는 클래스를 의미
- 메소드가 미완성이므로 **추상 클래스로는 객체를 생성할 수 없다**
- 주로 상속 계층에서 추상적인 개념을 나타내기 위한 용도로 사용된다.
- 하나 이상의 추상 메소드를 가지고 있다
- 몸체가 없는 메소드

## 상속과 다형성
- 다형성
- 많은(poly) + 모양(morph) 를 합친 의미로 주로 프로그래밍 언어에서
  하나의 식별자로 다양한 타입(클래스)을 처리하는 것을 의미한다
- 넓은 의미에서는 메소드 중복 정의(메소드 오버로딩)나 제너릭 프로그래밍도 다양성에 포함된다
- 일반적으로는 OOP에서 다형성이란 객체들의 타입(클래스)이 다르면 똑같은 메시지가 전달되더라도 서로 다른 동작을 하는 것을 말한다.

### 자바의 자료형 검사는 엄격하다
- 자바는 자료형을 엄격하게 검사하는 언어이다
- 하지만 예외가 있다
**부모 클래스의 참조 변수는 자식 클래스의 객체를 참조 가능하다**
- 부모 클래스의 참조 변수로 자식 클래스 객체를 참조 할 수 있다 => `상향 형변환`
  -> **다형성의 핵심**
  -> 자식 클래스는 항상 부모 클래스를 포함한다
**부모 클래스의 참조 변수를 가지고 자식 클래스 객체를 참조하는 것이 도대체 어디에 필요한가?**
- 객체 지향의 원리 중에서 다형성이 이것과 관련이 있다.
- 다형성이란 객체의 상황에 따라서 서로 다른 동작을 하는 것을 의미한다.
- *부모 클래스의 메소드를 호출하더라도 객체의 상황에 따라서 서로 다른 동작을 하도록 만들 수 있다.*

### 동적 메소드 호출
- 자바에서는 메소드 호출 시에 참조 변수가 가리키는 객체에 따라 메소드가 자동적으로 선택된다
- 메소드 호출을 실제 메소드의 몸체와 연결하는 것을 **바인딩(binding)**이라고 한다
  JVM(자바 가상 머신)은 실행 단계에서 객체의 타입을 보고 적절한 메소드를 호출하게 된다.
  이것을 **동적 바인딩(dynamic binding)** 또는 **가상 메소드 호출(virtual method invocation)** 이라고 한다.
- 동적 바인딩과 다형성을 활용하여 프로그래밍을 할 때의 장점
  - 프로그래밍 할 때 고려하지 않았던 도형의 종류도 처리할 수 있다
  - 결론적으로 다형성을 사용하면 **시스템에 최소한의 영향을 미치면서 새로운 유형의 객체를 쉽게 추가하여 시스템을 확장할 수 있다.**

### 상향 형변환의 이용
- 메소드의 매개 변수를 선언할 때도 상향 형변환을 많이 이용한다.
- 메소드의 매개 변수를 부모 클래스 타입으로 선언하면 훨씬 넓은 범위의 객체를 받을 수 있다.
**상속된 클래스들의 최상위 부모 클래스 타입으로 선언을 하게 되면 그 밑의 자식 객체들은 모조리 다형성을 적용 시킬 수 있다.**
- 만약 자바에서 생성되는 모든 객체를 전부 받는 메소드를 선언한다면 어떻게 해야 하는가?
- **모든 객체는 Object 클래스를 상속받는다**.
- 따라서 매개변수를 Object 클래스로 하면 자바의 모든 객체를 받을 수 있다.

## Object Class
- Object Class를 제외하고는 모든 클래스는 부모 클래스를 가지고 있다.
- 자바에서는 부모 클래스를 명시적을 지정하지 않으면 Object class의 자식 클래스로 암무적으로 간주
  => **모든 클래스의 부모 클래스는 Object 클래스**

### Object Class 내 메소드 <br>
- `Object clone()` : 객체 자신의 복사본을 생성하여 반환한다
- `boolean equals(Object obj)` : obj가 현재 객체와 같은지를 반환한다
  - `==` 연산자를 사용하여서 객체의 주소가 동일한지를 검사하여서 true or false를 반환한다
  - 하지만 객체에 대해서는 이것이 올바르지 않는 경우가 많이 있다
  - **그렇기 때문에 equals메소드를 그대로 사용하는것이 아닌 오버라이드 하여서 객체 안에 저장된 문자열이 동일하면 true를 반환하도록 재정의하여 사용한다.**
- `void finalize()` : 사용되지 않는 객체가 제거되기 직전에 호출된다
- `class getClass()` : 실행 시간에 객체의 클래스 정보를 반환한다
  - **리플렉션(reflection)**이라는 기법을 구현한 것
    - 객체 자신에 대하여 질문을 던질 수 있는 방법
    - 특히 안드로이드 프로그래밍에서는 종종 사용된다
- `int hashCode()` : 객체에 대한 해쉬 코드를 반환한다
- `String toString()` : 객체를 기술하는 문자열을 반환한다

### instanceof 연산자
- 객체가 지정된 타입(클래스)인지를 검사할 때 사용
- 구조 <br>
  `if (obj instanceof type) {` <br>
  `}` <br>
- 예시 <br>
  `String s = "This is a String";` <br>
  `if (s instanceof String) {` <br>
    `System.out.println("String 으로부터 만들어진 객체 맞습니다.)` <br>
  `}` <br>


### toString() 메소드
- 객체가 가진 정보를 한줄의 문자열로 만들어서 반환하며 이것은 디버깅에서 매우 유용하게 사용된다
- 객체에 대한 문자열표현은 전적을 객체에 따라 달라진다
- **toString() 메소드는 반드시 재정의하여야 할 필요가 있다**

### hashCode() 메소드
- 가끔은 hashCode() 메소드도 재정의 해야할 필요가 있다
- hashCode()는 hashing 이라는 **탐색 알고리즘에서 필요한 해시값을 생성하는 메소드** 이다.
- 조건
  1. 만약 2개의 객체가 동일하면, 동일한 해시 코드를 가져야함
  2. 2개의 객체가 동일한 해시값을 가지면, 객체가 동일할 수도 있고 아닐 수도 있다 (충돌 때문에)

## IS-A 관계와 HAS-A 관계
### 상속은 is-a 관계
- 상속에서 자식과 부모 클래스는 *"~은 ~이다"* 와 같은 `is-a` 관계가 있다
- 예시
  - 자동차는 탈것이다(Car is a Vehicle)
  - 강아지는 동물이다(Dog is a Animal)
- 만약 *"~은 ~을 가지고 있다"* 와 같은 `has-a(포함)` 관계가 성립되면 이 관계는 상속으로 모델링 해서는 안된다.

### has-a 관계
- OOP에서 `has-a 관계`는 `구성 관계(composition)` 또는 `집합 관계(aggregation)`을 의미
- `composition` 에서는 하나의 객체가 다른 객체의 부품이 된다.
- `aggregation` 에서는 하나의 객체가 다른 객체를 소유하게 된다.
- *객체 안에 **하나라도** 다른 객체가 포함되면 has-a 관계라고 할 수 있다.*

## 종단 클래스와 정적 메소드 재정의
### 종단 클래스
- **상속 시킬 수 없는 클래스**
- 주로 보안상의 이유로 필요함
- 대표적인 것으로 String class 가 있다.
- String class 는 컴파일러에서 많이 쓰이기 때문에 종단 클래스로 선언되어있다.
- 종단 클래스로 선언하려면 클래스의 선언 맨 앞에 final을 붙인다.

* 구조
  `final class String` <br>
  `{` <br>
    `...` <br>
  `}` <br>
### 종단 메소드
- 특정한 메소드만 오버라이드 될 수 없게 만들려면 `종단 메소드(final method)`로 선언하면 된다
- 규칙이나 룰 등 꼭 지켜져야 하며 외부에서 그 룰,규칙이 변경되면 안되기 때문에 이러한 경우에 종단 메소드로 작성한다.

### 정적 메소드 오버라이드
- 만약 자식 클래스에서 부모 클래스에 있는 정적 메소드와 동일한 메소드를 정의한다
- -> 자식 클래스의 메소드가 부모 클래스의 메소드를 가리게 된다.

**인스턴스 메소드의 오버라이드와의 차이점**
- 부모 클래스의 인스턴스 메소드를 자식 클래스에서 오버라이드 하면 무조건 자식클래스의 메소드가 호출됨
- 부모 클래스의 정적 메소드를 자식 클래스에서 오버라이드 하면 **클래스에 따라서 호출되는 메소드가 달라진다**.

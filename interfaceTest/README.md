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

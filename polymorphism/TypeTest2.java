package polymorphism;

class A {
  A() {    }
}

class B extends A{ // A 로 부터 상속받음
  B() {    }
}

public class TypeTest2 {
  public static void main(String[] args) {
    A a = new B();  // 상속을 받으면 부모클래스의 참조변수로 자식 클래스의 객체를 참조 할 수 있다.
    System.out.println(a);
  }  
}

package nestedClass;

public class OuterClass {
  private int value = 10;

  // 내부 클래스 안에서는 외부 클래스의 private 변수들을 참조할 수 있다.
  class InnerClass {
    public void myMethod(){
      System.out.println("외부 클래스의 private 변수 값: " + value);
    }
  }

  OuterClass() {
    InnerClass obj = new InnerClass();
    obj.myMethod();
  }
}

package anonymous;


public class Test {
  public void test(MyInterface1 m1){
    m1.print("Hello World");
  }

  public static void main(String[] args) {
    Test t = new Test();
    // // 1. anonymous class를 이용해 Test class 의 Instance method test 호출하시오.
    // t.test(new MyInterface1() {
    //   public void print(String s) {
    //     System.out.println(s);
    //   }
    // });

    // 2. lambda를 이용해 Test class의 인스턴스 method test 호출하시오
    // Interface인데 오직 하나의 abstract method를 가지는 Interface는
    // lambda로 구현할 수 있다.
    t.test((s)->{System.out.println(s);});  // 구현한 lambda expression
  }
}

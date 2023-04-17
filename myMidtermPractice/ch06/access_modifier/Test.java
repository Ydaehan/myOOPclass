package myMidtermPractice.ch06.access_modifier;

class A {
  //private int a;  // private
  int b;          // default
  public int c;   // public
}
public class Test {
  public static void main(String[] args) {
    A obj = new A();

    // obj.a = 10; // private member는 다른 클래스에서는 접근 안됨
    obj.b = 20; // default member는 접근 가능
    obj.c = 30; // public member 는 모든 곳에서 접근 가능
  }
}

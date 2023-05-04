package myMidtermPractice.ch06.constructor;

public class Oclass {
  class IClass {
    public void method() {
      System.out.println("내부 클래스");
    }
    IClass() {

    }
  }

  Oclass() {
    IClass obj = new IClass();
    obj.method();
  }
}

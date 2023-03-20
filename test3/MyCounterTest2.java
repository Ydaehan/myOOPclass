package test3;

public class MyCounterTest2 {
  public static void main(String[] args) {
    MyCounter obj = new MyCounter();
    System.out.println("obj.value = " + obj.value);
    obj.inc(obj);
    System.out.println("obj.value = " + obj.value);
  }
}

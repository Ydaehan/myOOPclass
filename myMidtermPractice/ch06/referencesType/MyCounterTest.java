package myMidtermPractice.ch06.referencesType;

import myMidtermPractice.ch06.referencesType.MyCounter;

public class MyCounterTest {
  public static void main(String[] args) {
    MyCounter obj = new MyCounter();

    System.out.println("obj.value = " + obj.value);
    obj.inc(obj);
    System.out.println("obj.value = " + obj.value);
    
  }
}

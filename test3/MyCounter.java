package test3;

public class MyCounter {
  // int counter;

  // // MyCounter 클래스의 생성자이다.
  // MyCounter(int value){ // 생성자가 매개변수를 가진다.
  //   counter = value;
  // }

  int value;
  void inc(int argA){
    argA += 1;
  }

  void inc(MyCounter ctr) {
    ctr.value = ctr.value + 1;
  }
}

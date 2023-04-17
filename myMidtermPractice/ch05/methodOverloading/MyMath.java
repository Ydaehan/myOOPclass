package myMidtermPractice.ch05.methodOverloading;

public class MyMath {
  // 정수 값을 제곱하는 메소드
  int square(int i){
    return i * i;
  }

  // 실수 값을 제곱하는 메소드
  double square(double i){
    return i * i;
  }

  // 매개 변수만 다르면 메소드 이름은 같아도 된다.
  // 이것을 메소드 오버로딩이라고 한다.
  
}

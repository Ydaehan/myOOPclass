package chusang;

public class Rectangle extends Shape {
  // Shape를 상속 받을 시 Shape 는 추상 클래스 이기 때문에
  // 내부의 추상 메서드를 구현 하지 않으면 Error 가 발생한다.
  @Override
  public void draw() {
    // TODO Auto-generated method stub
    System.out.println("사각형을 그립니다.");
  }
}

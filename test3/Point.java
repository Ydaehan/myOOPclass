package test3;

public class Point {
  private int x, y;

  // Counstructor
  public Point(int argX, int argY){
    x = argX;
    y = argY;
  }
  /* 부모로 부터 상속받은 메소드를 재정의 하는 것을 오버라이딩이라고 한다.*/
  // overriding
  @Override // toString 의 매개변수를 넣어주면 오버라이딩이 되지 않는다
  // 왜?
  // class 의 부모인 object 에는 매개변수를 가진 toString이라는 메서드는 존재하지 않기 때문에
  // 굳이 사용하려면 오버라이딩이 아닌 새로운 메서드로 취급 받는다.
  public String toString(){
    return "x: " + x + ", y: " + y;
  }
}

package chusang;

public abstract class Shape {
  private int x,y;

  // shape 를 상속받는 자식 클래스는 move 메서드를 그대로 사용하면 된다.
  public void move(int argX, int argY){
    x = argX;
    y = argY;
    System.out.println("도형을 [" + x + ", " + y + "]로 옮겼습니다.");
  }

  // shape 를 상속받는 자식 클래스는 화면에 그리는 기능을 가져야 하지만
  // 그려지는 모양은 서로 각각 다 다르다.
  // 따라서, shape 클래스는 그리는 기능을 수행하는 메소드의 시그니처만 정의하고
  // 메소드 몸체의 구현은 자식 클래스가 하도록 강제하자.

  // abstract 메서드를 가지려면 클래스 또한
  // abstract 클래스 여야만 가능하다.
  public abstract void draw() ;
}

package test3;

public class Rectangle {
  private int x,y,width,height;
  public Rectangle(int argX, int argY, int argWidth, int argHeight){
    x = argX;
    y = argY;
    width = argWidth;
    height = argHeight;
  }
  // 생성자 내에서는 다른 생성자를 부를 수 있다.
  public Rectangle(int argWidth, int argHeight){
    this(0,0,argWidth,argHeight); 
    // 생성자명으로 호출 하는 것이 아닌 this() 를 사용하여 호출한다.
  }
}

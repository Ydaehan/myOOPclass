package inheritanceClass;

public class Shape {
  private int x ,y;

  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public void setXY(int argX, int argY){
    x = argX;
    y = argY;
  }

  public void print(){
    System.out.println("x 좌표 : " + x + " y 좌표 : " + y);
  }
}

package inheritanceClass;

public class Rectangle extends Shape{
  private int width , height;

  public int getWidth(){
    return width;
  }
  public int getHeight(){
    return height;
  }
  public void setWidthHeight(int argWidth , int argHeight){
    width = argWidth;
    height = argHeight;
  }

  public double area(){
    return width * height;
  }

  public void draw() {
    System.out.println("(" + getX() + ", " + getY() + ") 위치에 " +"가로 : " + width + " 세로 : " + height);
  }
}

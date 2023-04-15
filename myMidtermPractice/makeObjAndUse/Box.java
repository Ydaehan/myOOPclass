package myMidtermPractice.makeObjAndUse;
public class Box {
  // Box class 를 정의하고 Box obj 하나 생성
  // Box 객체 내에 가로, 세로, 높이를 20, 20, 30 으로 성절
  // "상자의 가로, 세로, 높이는 20, 20, 30입니다." 출력 되게 하기
  private int width, length, height;
  

  public int getWidth() {
    return width;
  }
  public int getLength() {
    return length;
  }
  public int getHeight() {
    return height;
  }
  
  Box(int argWidth, int argLength, int argHeight){
    width = argWidth;
    length = argLength;
    height = argHeight;
  }


  @Override
  public String toString() {
    return "상자의 가로, 세로, 높이는 "+ getWidth() +", "+ getLength() +", "+ getHeight() +"입니다.";
  }
}

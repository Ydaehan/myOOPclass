package test;

public class Box1 {
  private int width, length, height;

  // 생성자
  // 객체를 생성 할 때 밑면의 가로 세로 값과 상자의 높이 값을 저장
  public Box1(int w, int len, int h){
    width = w;
    length = len;
    height = h;
  }

  // 상자의 부피를 구하는 메소드
  public int getVolume(){
    return width*length*height;
  }

  // 외부 값을 가져와서 쓰기 때문에 인스턴스 메소드일 필요는 없다.
  public static Box1 whoisLargerBox1(Box1 box1, Box1 box2){
    if(box1.getVolume() > box2.getVolume()){
      return box1;
    }
    return box2;
  }

  public static void main(String[] args) {
    Box1 b1 = new Box1(10, 20, 50);
    Box1 b2 = new Box1(10, 30, 30);
    System.out.println("첫 번째 박스의 부피 : " + b1.getVolume());
    System.out.println("두 번째 박스의 부피 : " + b2.getVolume());
    
    Box1 largerBox1 = Box1.whoisLargerBox1(b1, b2);
    System.out.println("더 큰 박스의 부피 : " + largerBox1.getVolume());
  }
}

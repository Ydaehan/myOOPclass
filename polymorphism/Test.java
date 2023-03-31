package polymorphism;

public class Test {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[5];
    // polymorphism (다형성)
    Shape s;
    
    s = new Shape();
    // s.draw();
    shapes[0] = s;

    s = new Rectangle();
    // s.draw();
    shapes[1] = s;
    
    s = new Triangle();
    // s.draw();
    shapes[2] = s;

    s = new Circle();
    // s.draw();
    shapes[3] = s;

    s = new Polygon();
    shapes[4] = s;

    drawShapes(shapes);
  }

  // 이런 식으로 메서드를 만들어 놓으면 향후 객체가 추가 되거나 하면
  // 그 객체의 메서드를 굳이 써 주지 않고 배열에 추가만 해주면 끝남.
  public static void drawShapes(Shape[] shapes){
    // for-Each 문
    for(Shape s : shapes){
      s.draw();
    }
    // 설명 : shapes 배열의 원소를 하나씩 꺼내 배열의 길이 만큼 반복
    //        하는데 꺼낸 원소를 Shape type의 s 라는 변수에 넣어라 라는 의미
    //        그리고 반복을 할 때 마다 s.draw(); 를 실행함.

    // 위의 for-Each 문을 for 문으로 바꾼 것
    // for(int i = 0 ; i < shapes.length; i++){
    //   shapes[i].draw();
    // }
  }
}

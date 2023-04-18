package myMidtermPractice.ch06.nestedClass;

class localInner {
  private int data = 30; // instance variable
  void display() {
    final String msg = "현재의 데이터값은 ";
    
    // 지역 클래스는 메소드 안에서만 사용이 가능하다
    // 외부 클래스의 private 변수에 접근이 가능하다
    class Local {
      void printMsg() {
        System.out.println(msg + data);
      }
    }
    Local obj = new Local();
    obj.printMsg();
  }
}

public class LocalInnerTest {
  public static void main(String[] args) {
    localInner obj = new localInner();
    obj.display();
  }
}

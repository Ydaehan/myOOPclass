package finalClass;

public class ChildOfFinalTest{ //extends FinalTest{
  // FinalTest class에서 정의한 첫 번째 사람은 무조건
  // 흑 돌을 반환하는 게임의 룰을 파괴할 수 있기 때문에

  // 이러한 경우에는
  // 종단 클래스로 만들어 상속이 안되게 막아야 한다.

  // 부모(조상) 클래스의 종단 메소드는 오버라이딩 할 수 없다.
  // @Override
  // public String getFirstPlayer() {
  //   return "WHITE";
  // }
}

package interfaceTest;

public interface RemoteControl { // 인터페이스도 extends 키워드를 붙여서 다른 인터페이스를 상속받을 수 있다.
  // define abstract method
  public void turnOn();
  public void turnOff(); 
  // 인터페이스 내에 선언되는 메소드들은 묵시적으로 public abstract 이다
  // 따라서 public이나 abstract 수식어는 없어도 된다
}
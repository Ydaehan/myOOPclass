package interfaceTest;

public class Television implements RemoteControl{
  boolean onOff = false;
  public void turnOn() {
    // Tv의 전원을 켜기 위한 코드가 들어간다
    onOff = true;
    System.out.println("Tv를 켰습니다. 상태 : " + onOff);
  }

  public void turnOff() {
    // Tv의 전원을 끄기 위한 코드가 들어간다
    onOff = false;
    System.out.println("Tv를 껐습니다. 상태 : " + onOff);
  }
}

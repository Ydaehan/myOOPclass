package interfaceTest;

public class SamsungTV implements AdvancedRemoteControl{

  @Override
  public void turnOn() {
    System.out.println("삼성 TV를 켭니다");
  }

  @Override
  public void turnOff() {
    System.out.println("삼성 TV를 끕니다");
  }

  @Override
  public void volumeControl(int amount) {
    String st = null;
    st = amount >= 0 ? "높입니다." : "줄입니다";
    System.out.println("삼성 TV의 볼륨을 " + Math.abs(amount) + " 만큼 " + st);
  }
  
  // java 8 version 부터는 interface가 default method 와 static method를 가질 수 있음
  // void changeChannel () {
  //   System.out.println("삼성 TV 채널을 바꿉니다.");
  // }

  // static void volumeUp () {
  //   System.out.println("삼성 TV의 볼륨을 높입니다.");
  // }
}

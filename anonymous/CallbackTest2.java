package anonymous;

import interfaceTest.LgTV;
import interfaceTest.RemoteControl;
import interfaceTest.SamsungTV;



public class CallbackTest2 {

  void remoteControl(RemoteControl rm) {
    rm.turnOn();
    System.out.println("리모트 컨트롤 메소드 호출 완료");
  }

  public static void main(String[] args) {
    CallbackTest2 cb = new CallbackTest2();
    // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오.
    // 1. 변수 사용해서 전달
    // 2. 변수 사용하지않고 전달
    // 화면에는 "파나소닉 테레비가 켜졌습니다"

    cb.remoteControl(
      new RemoteControl() {
        @Override
        public void turnOn() {
          System.out.println("파나소닉 테레비 켜짐 변수없음");
        }

        @Override
        public void turnOff() {
          System.out.println("파나소닉 테레비 꺼짐 변수없음");
        }
      }
    );

    RemoteControl rm = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("파나소닉 테레비 켜짐 변수있음");
      }

      @Override
      public void turnOff() {
        System.out.println("파나소닉 테레비 꺼짐 변수있음");
      }
    };

    // PanasonicTV tv = new PanasonicTV();
    // cb.remoteControl(tv);

    cb.remoteControl(new PanasonicTV());
    cb.remoteControl(new SamsungTV());
    cb.remoteControl(new LgTV());

    cb.remoteControl(new RemoteControl() {
      public void turnOff() {
        System.out.println("No Brand TV를 끕니다.");
      }

      @Override
      public void turnOn() {
        System.out.println("No Brand TV를 켭니다.");
      }
    });
  }
}

class PanasonicTV implements RemoteControl {

  @Override
  public void turnOn() {
    System.out.println("Panasonic TV Now turn On");
  }

  @Override
  public void turnOff() {
    System.out.println("Panasonic TV Now turn Off");
  }

}
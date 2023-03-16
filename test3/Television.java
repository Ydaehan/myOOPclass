package test3;

public class Television {
  private int channel,volume; // 채널 번호, 볼륨
  private boolean onOff;      // 전원 상태

  Television(int c, int v, boolean o){
    channel = c;
    volume = v;
    onOff = o;
  }

  void print(){
    System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }
}

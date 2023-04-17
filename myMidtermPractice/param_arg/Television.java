package myMidtermPractice.param_arg;

public class Television {
  int channel, volume;
  boolean onOff;

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) { // 매개변수를 가지는 메소드
    this.channel = channel;
  }

  void print() {
    System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }

  
}

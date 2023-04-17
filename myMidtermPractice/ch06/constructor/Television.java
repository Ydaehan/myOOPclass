package myMidtermPractice.ch06.constructor;

public class Television {
  private int channel, volume;
  private boolean onOff;
  Television(int argCh, int argVol, boolean argOnOff){
    channel = argCh;
    volume  = argVol;
    onOff   = argOnOff;
  }

  void print(){
    if(onOff == true){
      System.out.println("TV는 켜져 있고 채널은 " + channel + "이고 볼륨은" + volume + "입니다.");
    }else{
      System.out.println("TV는 꺼져 있습니다.");
    }
    
  }
}

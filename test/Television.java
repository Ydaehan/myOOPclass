package test;
public class Television{
    int channel;
    int volume;
    boolean isOn;
    
    void print(){  
        System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
    }
    
    int getChannel() {
        return channel;
    }

    void setChannel(int argCh){
        channel = argCh;
    }
}
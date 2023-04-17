package myMidtermPractice.ch06.constructor;

public class Box {
  private int width, height, length, volume;

  public int getVolume(){
    volume = width * height * length;
    return volume;
  }

  Box(int w, int h, int l){
    width   = w;
    height  = h;
    length  = l;
  }
}

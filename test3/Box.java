package test3;

public class Box {
  private int width,length,height,volume;

  public int getVolume() {
    return volume;
  }

  Box(int w, int l, int h){
    width = w;
    length = l;
    height = h;
    volume = width * length * height;
  }
}

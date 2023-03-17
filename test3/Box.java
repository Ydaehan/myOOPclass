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
    // volume = width * length * height;
  }

  boolean isSameBox(Box obj){
    if((obj.width == width) & (obj.length == length) & (obj.height == height)){
      return true;
    }else{
      return false;
    }
  }
}


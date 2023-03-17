public class Box {
  int width,length,height,volume;

  public Box(int w, int l, int h){
    width = w;
    length = l;
    height = h;
    volume = w * l * h;
  }

  Box whosLargest(Box box1, Box box2){
    if(box1.volume > box2.volume){
      return box1;
    }else{
      return box2;
    }
  }

  boolean isSameBox(Box obj){
    if((obj.width == width) & (obj.length == length) & (obj.height == height)){
      return true;
    }
    return false;
  }
}

package myMidtermPractice.ch06.boxSizeCheck;

public class Box {
  private int width, length, height;

  Box(int w, int l, int h){
    width = w;
    length = l;
    height = h;
  }

  boolean isSameBox(Box obj){
    int volume = this.width * this.height * this.length;
    if (volume == obj.width * obj.height * obj.length) {
      return true;
    }
    return false;
  }
}

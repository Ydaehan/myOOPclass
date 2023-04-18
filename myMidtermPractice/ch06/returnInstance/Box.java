package myMidtermPractice.ch06.returnInstance;

public class Box {
  int width, length, height, volume;

  Box(int w, int l, int h){
    width = w;
    length = l;
    height = h;
    volume = w * l * h;
  }

  Box whosLargest(Box box1, Box box2){
    if(box1.volume > box2.volume){
      return box1;
    }
    return box2;
  }
}

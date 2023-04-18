package myMidtermPractice.ch06.constructor;

public class Rectangle {
  private int x, y, width, height;

  Rectangle() {    
    this(0,0,1,1);
  }
  Rectangle(int width, int height) {    
    this(0, 0, width, height);
  }
  Rectangle(int x, int y, int width, int height) {    
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }
  // ...
}

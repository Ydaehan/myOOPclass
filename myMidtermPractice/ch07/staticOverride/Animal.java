package myMidtermPractice.ch07.staticOverride;

public class Animal {
  public static void eat() {
    System.out.println("Animal의 정적 메소드 eat()");
  }
  
  public void sound() {
    System.out.println("Animal의 인스턴스 메소드 sound()");
  }
}

package myMidtermPractice.ch07.staticOverride;

public class Cat extends Animal {
  public static void eat() {
    System.out.println("Cat의 정적 메소드 eat()");
  }

  @Override
  public void sound() {
    System.out.println("Cat의 인스턴스 메소드 sound()");
  }

  public static void main(String[] args) {
    Cat myCat = new Cat();
    Animal myAnimal = myCat;

    Animal.eat();
    myAnimal.sound();
  }
}

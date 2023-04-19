package myMidtermPractice.ch07.dynamicCall;

public class DynamicCallTest {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();

    Animal obj;

    obj = animal; // Animal type의 참조변수로 Animal 객체를 받음 -> 일반적인 객체 생성
    obj.sound(); 

    obj = dog;    // Animal type의 참조변수로 자식객체인 Dog 객체를 받음 -> 다향성 적용
    obj.sound();  // 동적 바인딩으로 Animal type 이지만 Dog 객체에서 override 된 sound메소드를 사용

    obj = cat;    // Animal type의 참조변수로 자식객체인 Cat 객체를 받음 -> 다향성 적용
    cat.sound();  // 동적 바인딩으로 Animal type 이지만 Cat 객체에서 override 된 sound메소드를 사용
  }
}

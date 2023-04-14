package staticOverriding;

public class Animal {

  // 모든 animal class의 instance가 공유하는 정적 메소드
  public static void eat(){
    System.out.println("동물이 밥을 먹습니다.");
  }
  /* sound는 instance method 이다. */
  // 즉, 객체가 생성되어야만 존재할 수 있는 메소드이다.
  public void sound(){
    System.out.println("Sound Of Animal");
  }
}

package objectClass;
import test.Box1;
public class CarTest {
  public static void main(String[] args) {
    // Car c1 = new Car();
    // Class classVar = c1.getClass();
    // System.out.println(classVar.getName());
    // System.out.println(c1);
    // result : objectClass.Car 출력
    /* 
     * objectClass 라는 패키지의 Car 라는
     * 클래스라는 정보를 출력
     */
    Car car1 = new Car("현대","그랜져");
    Car car2 = new Car("현대", "그랜져");
    Car car3 = null;
    
    System.out.println(car1.equals(car2));
    System.out.println(car1.equals(car3)); 
    // object class 의 method 인 equals는 주소만 비교
    // 내용을 비교하게 하고 싶다면 overriding 하여 재정의  
    // test.Box1 box1 = new test.Box1(10, 20, 30);
    Box1 box1 = new Box1(10, 20, 30);
    System.out.println(box1);
    System.out.println(car1.equals(box1));
    System.out.println("프로그램을 종료합니다.");
  }
}

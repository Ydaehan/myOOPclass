package teststatic;

public class Car {
  private String model;
  private String color;
  private int speed;

  // 상수란? : 한번 초기화되면 절대 값을 변경할 수 없는 값
  // 자바에서는 상수를 어떻게 만드나? final keyword 사용.
  // 자바에서 상수는 static으로 만드는 것이 바람직.
  // 상수는 대문자로 사용하는 것이 관례
  // 상수는 일반적으로 public으로 선언한다.
  // public static final int MAX_SPEED = 350;
  public static final int MAX_SPEED;

  // static 초기화 블록
  static{
    MAX_SPEED = 350;
    System.out.println("MAX_SPEED가 초기화 되었습니다.");
  }

  // instance 초기화 블록
  {
    model = "그랜저";
    color = "흰색";
  }
  // 자동차의 시리얼 넘버
  private int id;
  // 정적 멤버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 하자.
  private static int numbers = 0;

  // static method가 맞나? instance method로 구현하는 것이 맞나? : static
  // static method는 instance method를 호출할 수 있다 없다? : 없다.
  public static int getNumbers(){
    // print(); // static method 인 getNumber함수에서는 객체가 생성되어야 호출 할 수 있는
    // print 함수를 호출 할 수 없다.
    return numbers;
  }

  // instance method : instance 가 생성되어야만 존재하는 method
  public void print(){
    System.out.println("Hi~~~~~~~~");
  }

  // 생성자
  /* id = numbers ; */
  Car(String argModel, String argColor, int argSpeed){
    id = ++numbers;
    model = argModel;
    color = argColor;
    speed = argSpeed;
    // MAX_SPEED = 500; // final keyword의 상수는 값을 바꿀 수 없다.
  }
  
  public static void main(String[] args) {
    Car c1, c2, c3;
    c1 = new Car("s600","white",80);
    System.out.println("생성된 자동차 수:"+Car.numbers+"차종:"+c1.model);
    System.out.println("c1 의 id:"+c1.id);
    c2 = new Car("E500","blue",20);
    System.out.println("생성된 자동차 수:"+Car.numbers);
    System.out.println("c2 의 id:"+c2.id);
    c3 = new Car("E300","gray",160);
    System.out.println("생성된 자동차 수:"+Car.numbers);
    System.out.println("c3 의 id:"+c3.id);

    // 자바의 수학 관련 라이브러리 클래스는 정적 메서드 이용
    double d = Math.sqrt(9);
    System.out.println("9의 제곱근은 : " + d);

    System.out.println(Car.MAX_SPEED);
  }
}

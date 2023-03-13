package test;
public class Person { 
  // 현재는 Default 접근제어지정자 : 같은 폴더 내에서만 가능
  private String name;
  private int age; // 내부적으로 0 으로 설정
  String dept = "컴정"; // 읽기 전용 member variable

  public String getDept(){
    // 읽기 전용 메서드
    return dept;
  }

  /* java에서 특별한 이유가 없다면 member variable 은 private으로 설정
   * 그 member variable 을 클래스 외부에서 접근해야 한다면 그를 위한
   * method를 public으로 구현해라.
   * 예를 들어, myAge 라는 member variable에 값을 설정해야 하는 method는
   * setAge로, myAge라는 member variable의 값을 읽어오는 method는 getAge로
   * public 접근제어지정자를 명시하여 구현하면 된다.
   * 이렇게 함으로써 member variable에 잘못된 값이 설정되는 것을 막을 수도 있고
   * 향후에 그 클래스를 버전업 하면서 member variable의 이름을 변경해도
   * 그 클래스를 사용하는 외부 클래스에는 아무 영향을 미치지 않게 된다.
  */

  /* 
   * 접근제어지정자(Access modifier)
   *  : public, protected, default, private
   * public 이 명시된 member(variable| method) 그 클래스 내부, 외부
   *                어느 곳에서든 접근 가능하다.
   * protected가 명시된 member는 그 클래스 내부, 그리고 그 클래스의 자식, 그리고
   * 그 클래스와 같은 패키지에 속한 다른 클래스에서도 접근가능하다.
   * 
   * 접근제어지정자가 명시되어 있지 않은 경우, 이를 default 접근제어지정자 라고 한다.
   * default 접근제어지정자가 명시된 member 는 그 클래스 내부, 그리고 그 클래스와 같은 패키지에 속한
   * 다른 클래스에서도 접근가능하다. protected 와의 차이는 상속관계에서는 사용이 불가하다는 것이다.
   * 
   */
  public int getAge(){
    // 외부에서 멤버 변수의 값을 받기 위함
    return age;
  }

  public void setAge(int argAge){
    // 외부에서 멤버 변수의 값을 바꾸기 위함
    // 이렇게하면 직접적으로 접근하는 것에 비해
    // 로직을 짜서 예외 처리가 가능하다.
    if(argAge >= 0 && argAge <= 150)
      age = argAge;
    else
      System.out.println("나이의 범위는 0부터 150까지 입니다.");
  }

  public String getName(){
    return name;
  }

  public void setName(String argName){
    name = argName;
  }
 
}

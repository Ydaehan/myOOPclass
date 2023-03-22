package teststatic;

public class Employee {
  private String name;
  private double salary;

  private static int count = 0; // static variable

  // constructor
  public Employee(String n, double s){
    name = n;
    salary = s;
    count++; // static variable 인 count 증가
  }

  // instance 가 소멸될 때 호출된다.
  protected void finalize(){
    count--; // 직원이 하나 줄어드는 것이므로 count를 하나 감소
  }

  // static method
  public static int getCount(){
    return count;
  }
}

package test;
public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    // Person.java 의 멤버 변수의 접근 제어자가 private로 지정되어 있기 때문에 
    // 직접적인 접근이 불가하지만, 값을 직접 바꾸지 않고 값을 가지고 올 수 있는 
    // public(공개) 메서드를 만들어라
    p.setAge(20);
    p.setName("홍길동");
    // String d = p.dept; // dept 가 private 가 되어 버리면 접근이 불가능 하기 때문에
    
    // The field
    int pAge = p.getAge();
    String pName = p.getName();
    String pDept = p.getDept();
    System.out.println(pName);
    System.out.println(pAge);
    System.out.println(pDept); /*  dept 라는 private 로 지정된 member는 값을 외부에서 
    변경할 수 없기 때문에 읽기 전용 메서드로 읽어 오는 수 밖에 없다. */ 
  }
}

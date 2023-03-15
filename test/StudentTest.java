package test;

public class StudentTest {
  public static void main(String[] args) {
    Student std = new Student();
    // 멤버변수는 가급적 private으로 해두고
    // 그 멤버변수에 간접적으로 접근 할 수 있게 하고 싶다면
    // public method를 이용해 해당 로직을 만들어라
    std.setName("고길동");
    std.setBirthYear(2002);

    System.out.println(std.getName());
    // System.out.println(std.getBirthYear()); 
    System.out.println(std.getAge());
  }
}

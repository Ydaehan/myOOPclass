package test3;

public class Student2 {
  private String name;
  private int birthYear;
  private String dept;
  private String address;

  public Student2(String argName, int argBirthYear, String argDept, String argAddress){
    name = argName;
		birthYear = argBirthYear;
		dept = argDept;
		address = argAddress;
  }

  public Student2(){
    // 생성자도 오버로딩이 가능하다.    
  }
}

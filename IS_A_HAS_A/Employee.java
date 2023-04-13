package IS_A_HAS_A;

public class Employee {
  private String name;
  private Date birthDate; // Has-a 관계를 구현한 부분

  public Employee(String argName, Date argBirDate){
    name = argName;
    birthDate = argBirDate;
  }

  @Override
  public String toString() {
    return "Employee [name=" + name +
    ", birthDate=" + birthDate + "]";
  }
}

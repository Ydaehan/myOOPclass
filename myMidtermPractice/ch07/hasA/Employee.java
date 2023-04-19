package myMidtermPractice.ch07.hasA;

public class Employee {
  private String name;
  private Date birthDate; // Has-A 관계를 구현한 부분

  public Employee(String name, Date birthDate){
    this.name = name;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "Employee [name=" + name + ", birthDate=" + birthDate + "]";
  }
}

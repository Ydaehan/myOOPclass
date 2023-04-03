package inheritanceClass;

public class Employee {
  public String name;     // 이름 : public member
  String address;         // 주소 : package member
  protected int salary;   // 월급 : protected member
  private int rrn;        // 주민등록번호 : private member

  public Employee(String argName, String argAddress, int argSalary, int argRrn){
    name = argName;
    address = argAddress;
    salary = argSalary;
    rrn = argRrn;
  }


  @Override
  public String toString() {
    return "Employee [name=" + name + ", address=" + address + ", salary" + salary + ", rrn=" + rrn + "]";
  }
}

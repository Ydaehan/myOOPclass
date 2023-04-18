package myMidtermPractice.ch06.employeeEx;

public class Employee {
  public String name;
  public double salary;
  public static int count;

  Employee (String n , double s){
    name = n;
    salary = s;
    count++;
  }

  protected void finalize(){
    count--;
  }

  public static int getCount(){
    return count;
  }
}

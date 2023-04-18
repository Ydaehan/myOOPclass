package myMidtermPractice.ch06.constructor;

public class Student {
  private int number,age;
  private String name;

  Student() {
    number =  100;
    name = "New Student";
    age = 18;
  }

  Student(int number, int age, String name){
    this.name = name;
    this.number = number;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student [number =" + number + ", name=" + name + ", age=" + age + "]";
  }

}

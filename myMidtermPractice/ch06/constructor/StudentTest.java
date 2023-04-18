package myMidtermPractice.ch06.constructor;

public class StudentTest {
  public static void main(String[] args) {
    Student obj1 = new Student();
    Student obj2 = new Student(111, 25, "Kim");

    System.out.println(obj1);
    System.out.println(obj2);
  }
}

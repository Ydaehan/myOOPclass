package myMidtermPractice.ch06.constructor;

public class DateTest {
  public static void main(String[] args) {
    Date day1,day2,day3 ;
    day1 = new Date(2015, "8월", 10);
    day2 = new Date(2020);
    day3 = new Date();

    System.out.println(day1 + "\n" + day2 + "\n" + day3);
  }
}

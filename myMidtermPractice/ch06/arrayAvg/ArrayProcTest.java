package myMidtermPractice.ch06.arrayAvg;

public class ArrayProcTest {
  final static int STUDENTS = 5;
  public static void main(String[] args) {
    int[] scores = new int[STUDENTS];
    ArrayProc obj = new ArrayProc();
    obj.getValue(scores);
    System.out.println("평균은 = " + obj.getAverage(scores));
    
  }
}

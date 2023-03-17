package test3;

public class ArrayProcTest {
  final static int STUDENTS = 5;
  public static void main(String[] args) {
    /* int[] list = {1,2,3,4,5};
    ArrayProc obj = new ArrayProc();
    
    obj.inc(list);

    for(int i = 0; i < list.length; i++){
      System.out.print(list[i] + " ");
    } */

    int[] scores = new int[STUDENTS];
    ArrayProc obj = new ArrayProc();
    obj.getValue(scores);
    System.out.println("평균은 = " + obj.getAverage(scores));
    
  }
}

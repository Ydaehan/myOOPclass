package myMidtermPractice.ch06.constructor;

public class TelevisionTest {
  public static void main(String[] args) {
    Television myTv   = new Television(7, 10, true);
    Television yourTv = new Television(11, 20, false);
    myTv.print();
    yourTv.print();
  }
}

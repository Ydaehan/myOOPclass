package myMidtermPractice.ch05.method;

public class TelevisionTest {
  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.channel = 7;
    tv1.volume = 9;
    tv1.onOff = true;
    tv1.print();

    Television tv2 = new Television();
    tv2.channel = 9;
    tv2.volume = 12;
    tv2.onOff = true;
    tv2.print();
  }
}

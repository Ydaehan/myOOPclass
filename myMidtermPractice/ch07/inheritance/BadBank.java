package myMidtermPractice.ch07.inheritance;

public class BadBank extends Bank{
  @Override
  double getInterestRate(){
    return 10.0;
  }
}

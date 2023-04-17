package myMidtermPractice.ch05.param_arg;

public class MathTest {
  public static void main(String[] args) {
    int sum;
    Math obj = new Math();
    sum = obj.add(2, 3); // 2 와 3 은 인수로써 add()에 전달 된다.
    System.out.println("2와 3의 합은 : "+ sum);
    sum = obj.add(7, 8); // 7 과 8 은 인수로써 add()에 전달 된다.
    System.out.println("7와 8의 합은 : "+ sum);
  }
}

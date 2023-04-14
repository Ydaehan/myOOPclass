package test;
public class StringTest {
  public static void main(String[] args) {
    String proverb = "A barking dog"; // new 연산자 생략
    String s1, s2, s3, s4; // 참조 변수로서 메소드에서 반환된 참조값을 받는다.

    System.out.println("문자열의 길이 = " + proverb.length());
    proverb.concat(" never Bites!");
    proverb.replace('g', 'G');
    proverb.substring(2, 3);
    proverb.toUpperCase();

    System.out.println(proverb);    // Java 에서 String 은 immutable(변경할 수 없다) 이다.
    s1 = proverb.concat(" never Bites!"); // 문자열 결합
    s2 = proverb.replace('g', 'G');       // 문자 교환
    s3 = proverb.substring(2, 3);         // 부분 문자열 추출 2 ~ 4 까지 3글자 추출 
    // substring(beginIndex , endIndex); beginIndex 는 포함 endIndex는 미포함
    s4 = proverb.toUpperCase();           // 대문자로 변환
    
    // 새로운 문자열을 만들어서 반환 해주어야 한다.
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);

    int x = 20;
    // 기본적으로 문자열과 숫자형은 덧셈이 불가능 하지만
    System.out.println("결과값은 " + x); // JVM 에서 내부적으로 숫자형을 문자형으로 바꾼다.
    System.out.println("100" + x); // 문자열 "100" 과 숫자형 x(20) 을 더할때는 x를 문자열로 변환하여 더하기 때문에
    // 10020 이라는 값이 나오게 되는것이다.
    System.out.println(100 + x); // 둘 다 숫자형 이기 때문에 값이 덧셈이 된다.

    String s = "1234";
    int n = Integer.parseInt(s);
    System.out.println(n);
    // 문자열을 수치값으로 변경 해주는 Integer.parseInt -> Int형으로 바꾸어준다.
    double d = Double.parseDouble(s);
    System.out.println(d);
    // 문자열을 수치값으로 변경 해주는 Double.parseDouble -> Double형으로 바꾸어준다.
    float f = Float.parseFloat(s);
    System.out.println(f);
    // 문자열을 수치값으로 변경 해주는 Float.parseFloat -> Float형으로 바꾸어준다.
    long l = Long.parseLong(s);
    System.out.println(l);
    // 문자열을 수치값으로 변경 해주는 Long.parseLong -> Long형으로 바꾸어준다.
    
  }
}

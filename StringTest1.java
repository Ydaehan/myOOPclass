import java.util.Scanner;

public class StringTest1 {
  public static void main(String[] args) {
    String str;
    Scanner scn = new Scanner(System.in);

    while(true){
      System.out.print("문자열을 입력하세요> ");
      str = scn.next();
      if(str.equals("quit") == true || str.equals("exit") == true){
        break;
      }
      if(str.matches("^www\\.(.+)")) { // www.로 시작하는 문자열인지를 검사한다.
        System.out.println(str + " 은 'www'로 시작합니다.");
      } else {
        System.out.println(str + " 은 'www'로 시작하지 않습니다.");
      }
    }
  }  
}

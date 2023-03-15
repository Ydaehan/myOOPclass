package test;

public class test {
  public static void main(String[] args) {
    int[] a = new int[10];
    // 배열을 감싸는 클래스를 만들어서 배열은 private로 숨기고 배열의 값 설정 및 호출 method 는 public으로
    // index 경계를 벗어나면 error 발생하게 출력 ex) err)index N out of bound for length X

    for(int i = 0; i < 10; i++){
      a[i] = i+1;
    }

    System.out.println("프로그램을 종료합니다.");
  }
}

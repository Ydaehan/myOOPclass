package interfaceTest;

public class Test {
  public static void main(String[] args) {
    String s1, s2;
    s1 = "BBC";
    s2 = "ABD";
    System.out.println(s1.compareTo(s2));

    Student std1, std2;
    std1 = new Student("일지매", "컴정");
    std2 = new Student("홍길동", "컴정");
    findLarger(std1, std2);
  }

  public static void findLarger(Comparable2 c1, Comparable2 c2){
    if (c1.compareTo(c2) == 0){
      System.out.println("같다.");
    } else if (c1.compareTo(c2) == -1) {
      System.out.println("첫번째가 크다.");
    } else {
      System.out.println("두번째가 크다");
    }
  }
}

package sortingAlgorithmTest;

public class Student extends Comparable{
  private String name;
  private String stdNum;
  
  // 나머지 생략
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getStdNum() {
    return stdNum;
  }
  public void setStdNum(String stdNum) {
    this.stdNum = stdNum;
  }
  
  public Student(String argName, String argStdNum){
    name = argName;
    stdNum = argStdNum;
  }

  @Override
  public String toString() {
    return "[이름: "+ name + ", 학번: " + stdNum + "]"; 
  }

  @Override
  public int compareTo(Comparable anotherVal) {
    // 이름 순으로 정렬 할 수 있도록 이름 비교를 하자.
    // 내가 가진 name과, anotherVal 객체의 name을 비교해서
    // 알파벳 순으로 내 이름이 앞이면 -1, 이름이 같으면 0,
    // 내 이름이 뒤쪽이면 1 을 반환하자.
    // 무조건 Student 가 온다고 가정
    
    Student std = (Student)anotherVal; // 하향 형변환
    // String stdName = std.getName();
    // 자바의 String class 는 이미 String값을 비교하는 compareTo 함수가 존재
    // 다른 String 을 받아서 두 String을 비교하여 사전 순서에 따라서
    // 순서가 나의 String 이 앞이면 -1, 같으면 0, 뒤면 1을 반환한다.

    // 그럼 학번 순으로 정렬 하고자 하면?
    String yourStdNum = std.getStdNum();
    return stdNum.compareTo(yourStdNum);
  }
  
}

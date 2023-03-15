package test;

import java.time.LocalDate;

public class Student {
  private String name;
  private int birthYear;

  public void setName(String argName/* String name */){
    // this.name = name;
    name = argName;
  }

  public void setBirthYear(int argBirthYear /* int birthYear */){
    // this.birthYear = birthYear;
    if(argBirthYear >= 1900){
      birthYear = argBirthYear;
      return;
    }
  }

  public String getName(){
    return name;
  }

  // 보통 연도를 묻지 않고 나이를 묻기 때문에 잘 안쓰이는 메서드
  public int getBirthYear(){
    return birthYear;
  }

  // 나이를 계산하는 메서드는?
  public int getAge(){
    // java.time 이라는 package 내에 LocalDate 라는 객체를 사용 가능
    LocalDate d = LocalDate.now(); // 현재 날짜 정보가 필요할 때 사용
    // 날짜 정보만 출력된다.
    // 시간 정보는 ? LocalTime 을 사용 but 시간 정보만 출력된다.
    // 그럼? 둘다 볼려고 하면?
    // LocalDateTime => 날짜와 시간 정보 모두 출력
    int year = d.getYear(); // 현재 d 에는 날짜 정보가 있는데 그 중 연도만 들고와서 저장
    return (year - birthYear); // 해당 연도는 생년을 뜻함
    // 현재 연도에서 생년을 빼면 만나이가 출력
  }
}

package test3;

public class Date{
  private int year, day;
  private String month;

  // 생성자
  public Date(int argYear, String argMonth, int argDay){ 
    year = argYear;
    month = argMonth;
    day =argDay;
  }
  // 생성자
  public Date(int argYear){ 
    this(argYear, "1월", 1);
  }
  // 기본 생성자
  public Date(){
    this(1900, "1월", 1);
  }

  @Override
  public String toString(){
    return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
  }
}

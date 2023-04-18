package myMidtermPractice.ch06.constructor;

public class Date {
  private int year, day;
  private String month;

  public Date(int y, String m, int d){
    this.year = y;
    this.month = m;
    this.day = d;
  }
  public Date(int y){
    this(y, "1월", 1); 
  }
  public Date(){
    this(1900, "1월", 1);
  }

  @Override
  public String toString() {
    return "[year=" + year + ", month=" + month + ", day=" + day + "]";
  }
}

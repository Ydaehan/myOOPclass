package IS_A_HAS_A;

public class Date {
  private int year, month, date;
  
  public Date(int argYear, int argMonth, int argDate){
    year = argYear;
    month = argMonth;
    date = argDate;
  }

  @Override
  public String toString() {    
    return "Date [year=" + year + ", month="
    + month + ", date=" + date + "]";
  }
}

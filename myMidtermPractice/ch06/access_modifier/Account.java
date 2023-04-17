package myMidtermPractice.ch06.access_modifier;

public class Account {
  private int regNumber;
  private String name;
  private int balance;

  public String getName(){ 
    return name; 
  }
  public void setName(String argName) {
    name = argName;
  }

  public int getBalance(){
    return balance;
  }
  public void setBalance(int argBalance){
    balance = argBalance;
  }

  public int getRegNumber(){
    return regNumber;
  }
  public void setRegNumber(int argRegNumber){
    regNumber = argRegNumber;
  }
}

package test3;

public class Account {
  // 필드가 모두 private으로 선언 되었다
  // 클래스 내부에서만 사용이 가능하며 외부 접근이 불가하다
  private int regNumber;
  private String name;
  private int balance;

  // 접근자와 생성자
  public String getName(){
    return name;
  }
  public void setName(String argName){
    name = argName;
  }
  public int getBalance(){
    return balance;
  }
  public void setBalance(int argBalance){
    balance = argBalance;
  }
}

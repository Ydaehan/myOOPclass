package inheritanceClass;

public class CBank extends Bank{
  public CBank(){
    super.setInterestRate(super.getInterestRate()+10.0);
  }
}

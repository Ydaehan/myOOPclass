package inheritanceClass;

public class BBank extends Bank{
  @Override
  public double getInterestRate(){
    return super.getInterestRate() + 5.0;
  }
}

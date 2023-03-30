package inheritanceClass;

public class BankTest {
  public static void main(String[] args) {
    ABank a = new ABank();
    BBank b = new BBank();
    CBank c = new CBank();
 
    System.out.println("A Bank의 이자율: " + a.getInterestRate());
    System.out.println("B Bank의 이자율: " + b.getInterestRate());
    System.out.println("C Bank의 이자율: " + c.getInterestRate());
  }
}

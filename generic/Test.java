package generic;

public class Test {
  public static void main(String[] args) {
    // IntBox ib1 = new IntBox();
    // IntBox ib2 = new IntBox();
    // ib1.setValue(10);
    // // System.out.println(ib1.getValue());

    // ib2.setValue(20);

    // int result = ib1.getValue() + ib2.getValue();
    // System.out.println(result);

    // StrBox sb1 = new StrBox();
    // StrBox sb2 = new StrBox();
    // sb1.setValue("동해물과 ");
    // sb2.setValue("백두산이 ");
    
    // String result = sb1.getValue() + sb2.getValue();
    // System.out.println(result);

    // int idx = result.indexOf("백두산이");
    // System.out.println(result.substring(idx));

    // Box b1 = new Box();
    // Box b2 = new Box(); 

    // b1.setValue(20);    // Object 형으로 다 받아드릴수는 있지만
    // b2.setValue(30);

    // int result = (int)b1.getValue() + (int)b2.getValue(); // Object 형 끼리 더해서 int에 넣을 순 없다
    // // 강제형변환 시켜주어야 제대로 동작함.
    // System.out.println(result);

    Box strBox = new Box();
    strBox.setValue("마르고 닳도록 하느님이 보우하사 우리나라 만세!");
    Object v = strBox.getValue();
    int idx = ((String)v).indexOf("우리나라");
    System.out.println(((String)v).substring(idx));

    int val = (int)strBox.getValue(); // 값을 Object type으로 리턴해주기 때문에 형변환이 안됨
    System.out.println("프로그램을 종료합니다.");
    /* 문제점 */
    /* 
     * 1. 값을 빼서 쓸 때 명시적 타입 캐스팅(형변환)을 해야한다. => 귀찮다. 런타임 오류 발생 가능
     */
  }
}

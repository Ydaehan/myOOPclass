package test;

public class MyCounter1 {

  private int value;

  public void setValue(int argValue){
    value = argValue;
  }

  public int getValue(){
    return value;
  }

  public static void addOne(int val){ // 이곳의 val 은 main method 의 val의 값만 가진 매개변수로
    // 지역변수 이기 때문에 addOne method 의 val 변수는 해당 method 가 종료 되기 전 리턴 해주지 않으면
    // 값은 사라진다.

    // 값을 변경하는 method 를 만들고 싶으면 return을 해주어야 한다.
    // 또는 위 와 같은 call by value 가 아닌 call by reference 로 주소값으로 받아와서 객체에 저장시킬 경우
    // 값을 변경 할 수 있다.

    val = val + 1;
    // return val;
  }
  public static void increase(MyCounter1 cntObj) {
    // 이처럼 call by reference 방식으로 객체의 주소값을 매개변수의 인자값을 받아와
    // 객체 내의 멤버변수의 값을 변경 시킬 수 있다.
    int v = cntObj.getValue() + 1;
    cntObj.setValue(v);  
  }

  public static void main(String[] args) {
    // int val = 10;
    // MyCounter1.addOne(val);
    // val = MyCounter1.addOne(val);
    // System.out.println(val);
    
    MyCounter1 mc = new MyCounter1();
    mc.setValue(10);
    System.out.println(mc.getValue());
    MyCounter1.increase(mc);
    System.out.println(mc.getValue());
  }
}

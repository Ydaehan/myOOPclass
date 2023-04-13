package objectClass;

public class CarTest1 {
  public static void main(String[] args) {
    Car1 firstCar = new Car1("HMW520");
    Car1 secondCar = new Car1("HMW520");
    if(firstCar.equals(secondCar)){
      System.out.println("동일한 종류의 자동차입니다.");
    }else{
      System.out.println("동일한 종류의 자동차가 아닙니다.");
    }
    // System.out.println("obj is of type " + obj.getClass().getName());
    // 객체를 생성한 클래스 이름을 반환한다
  }
}

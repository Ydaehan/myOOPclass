package objectClass;

public class Car {
  String brand;
  String model;

  public Car(){
    this("Unknown","Unknown");
  }

  public Car(String argBrand, String argModel){
    brand = argBrand;
    model = argModel;
  }

  @Override
  public String toString() {
    String msg = "brand: " + this.brand + ", " + "model: " + this.model;
    return msg;
  }

  @Override
  public boolean equals(Object obj) {
    // obj가 Car 클래스의 인스턴스가 아니면 바로 false를 반환하자
    // java 에는 이 목적으로 사용할 수 있는 연산자(산술,논리,조건)가 있다.
    // instanceOf 가 있다.
    // obj는 Car 클래스의 객체라 가정한다
    // 그래야, Car 클래스의 인스턴스의 brand, model 멤버에 접근할 수 있다.
    // 하향 형변환
    if(!(obj == null) && obj instanceof Car){
      Car yourCar = (Car)obj;
      if(yourCar.brand.equals(brand) && yourCar.model.equals(model)){
        return true;
      }
    }
    return false;
  }
}

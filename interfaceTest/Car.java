package interfaceTest;

public class Car implements Comparable2{
  private String brand, model;
  private int speed, price;

  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public int getSpeed() {
    return speed;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  Car(){
    // this.brand = "Unknown";
    // this.model = "Unknown";
    // this.speed = 0;
    // this.price = 0;
    this("Unknown", "Unknown", 0, 0);
  }

  @Override
  public String toString() {
    return "[브랜드:" + this.brand + ", 모델:" + this.model + ", speed:" + speed + ", price:" + price + "]";
  }

  Car(String brand, String model, int speed, int price){
    this.brand = brand;
    this.model = model;
    this.speed = speed;
    this.price = price;
  }
  
  public int compareTo(Comparable2 obj){   
    // 차의 가격 비교를 하려면, Car class의 getPrice 메소드를 호출해야되니, 
    // 부득이 Comparable 타입으로 받은 인자를
    // Car 타입으로 하향 형변환
    // 물론 이 obj 객체는 Car class type의 객체이어야만 하고
    // 그렇다고 가정한다
    // if(this.price > ((Car)obj).price){
    //   return 1;
    // }else if (this.price < ((Car)obj).price) {
    //   return -1;
    // }
    // return 0;
    Car aCar = (Car)obj;
    int aPrice = aCar.getPrice();
    if (this.price == aPrice){
      return 0;
    }else if (this.price < aPrice){
      return -1;
    }
    return 1;
  }
  
}

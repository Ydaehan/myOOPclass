package test;
public class Car {
    String color; // 새강
    int speed; // 속도
    int gear; // 기어
    
    public String toString(){
        return "Car [color= "+ color + ", speed= " + speed + ", gear= " + gear + "]";
    }

    void changeGear(int g){
        gear = g;
    }

    void speedUp(){
        speed = speed + 10;
        // speed += 10; 과 동일
    }

    void speedDown(){
        speed = speed - 10;
        // speed -= 10; 과 동일
    }
}

package test;
public class MyMathTest {
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 자바에서는 같은 이름의 메소드가 여러 개 
        // 존재 할 수 있다.
        // 단, 메소드의 매개변수의 갯수 나 타입이 달라야한다.
        
        MyMath obj = new MyMath();
        System.out.println(obj.square(10));
        System.out.println(obj.square(3.14));
    }
}

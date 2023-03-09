public class JavaTest {
    // Private 를 앞에 붙이는 순간 error 가 발생 
    // Private -> 같은 클래스 내부에서만 접근이 가능하고
    // 외부에서는 불가
    // 앞으로 특별한 이유가 없는 한 private 으로 만들어야한다.
    // 외부에서 접근하려면? 
    // public method를 만들어라

    // instance variable 
    private String name;

    // instance method 
    String getName(){
        return name;
        
        // this. 이 생략 된 코드이다.
        // this. 은 생성된 객체를 가르키며 this.name 은 생성된 객체의 name 값을 가르킴
        
    }

    //static method : instance를 생성하지 않아도 접근 가능 (생성 해도 당연히 접근 가능)
    static void sayHello(){
        System.out.println("Hi!!!!!!!!!!!!!");
    }
    void setName(String argName){
        name = argName;
    }

    // member method
    // instance method

    // double square_double(double df){
    //     test();
    //     return df*df;
    // }

    // int square_int (int num){
    //     return num*num;
    // }

    // 자바에서는 오버로딩을 지원한다
    // 메서드의 매개변수의 갯수 , 타입이 다른 메서드를 여러개 정의 할 수 있게 해준다.

    double square (double df){
        test();
        return df*df;
    }

    int square(int num){
        return num*num;
    }

    void test(){
        System.out.println("test method called");
    }

    public static void main(String[] args) {
        JavaTest t = new JavaTest();
        // t.name = "HongGilDong";
        // t.setName("홍길동");
        // System.out.println(t.name);

        // JavaTest t2 = new JavaTest();
        // t2.name = "T2";
        // t2.setName("T2");
        // System.out.println(t2.name); 
        
        // System.out.println("hello world");
        // double r = square(4.0);

        // if(args.length==0){
        //     System.out.println("Usage: java JavaTest name");
        //     return;
        // }else{
        //     System.out.println("Hello" + args[0]);
        // }

        // JavaTest jt = new JavaTest();
        // double result = jt.square(3.14);
        // int result2 = jt.square(3);
        // System.out.println(result);
        // System.out.println(result2);

        // // println 메서드 또한 메서드 오버로딩이 되어 있다.
        // System.out.println("String...");
        // System.out.println(4);
        // System.out.println(true);
        // System.out.println(8.6);

        // call static method
        JavaTest.sayHello(); // instance 로 만들지 않아도 접근이 가능하다
        t.sayHello(); // instance 를 생성하여도 접근이 가능하다.
        // 밑줄이 그어지는 이유는 static인데 굳이 왜 객체에서 호출을 했냐는 의문
    }
}

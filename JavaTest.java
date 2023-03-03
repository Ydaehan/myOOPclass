public class JavaTest {
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
        // System.out.println("hello world");
        // double r = square(4.0);

        if(args.length==0){
            System.out.println("Usage: java JavaTest name");
            return;
        }else{
            System.out.println("Hello" + args[0]);
        }
        
        JavaTest jt = new JavaTest();
        double result = jt.square(3.14);
        int result2 = jt.square(3);
        System.out.println(result);
        System.out.println(result2);

        // println 메서드 또한 메서드 오버로딩이 되어 있다.
        System.out.println("문자열");
        System.out.println(4);
        System.out.println(true);
        System.out.println(8.6);
    }
}

package test;

public class test {
    public static void main(String[] args) {
        JavaTest t1 = new JavaTest();
        t1.setName("HongGilDong");
        System.out.println(t1.getName());
        // 객체를 생성 하였기 때문에 인스턴스변수에 접근을 할 수 있다
        // 그러므로 위 와 같이 사용 할 수는 있다.

        // String.charAt(0);
        String s1 = "동해물과 백두산이"; // new String("동해물과 백두산이");
        char c = s1.charAt(5);
        System.out.println(c);
        String s2 = "동해물과 백두산이";
        boolean r = s1 == s2;
        // java 의 optimization 으로 인해 리터럴이 같은 것은 주소를 같은 값을 할당해준다.
        String s3 = new String("동해물과 백두산이"); 
        boolean r2 = s1 == s3;
        System.out.println("s1 == s2 : " + r); // true
        System.out.println("s1 == s3 : " + r2);// false
        // r2 가 false 값이 나온 이유는 같은 리터럴 값을 준 것과 별개로 new 연산자로 객체를 새로 생성하라고
        // 명령 했기 때문에 같은 리터럴 값이 들어가도 객체를 새로 생성해서 다른 주소값으로 할당해준다.

        r = s3.equals(s1);
        System.out.println("s3.equals(s1)Result : " + r);

        s1 = new String("i love you");
        s2 = new String("I Love You");

        r = s1.equalsIgnoreCase(s2);
        System.out.println("equalsIgnoreCaseResult : "+ r);

        // String 객체는 immutable입니다. mutable이 아닙니다.
        // 이 말은 즉 String 객체의 값은 변경할 수 없다는 말이다.
        
    }
}

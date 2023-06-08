package generic;

public class GenericTest2 {
  public static void main(String[] args) {
    // GenericPair class object 2개를 생성해서 값을 넣고 빼고 해보세요.
    GenericPair<Integer,String> obj1 = new GenericPair<Integer,String>(1500,"KM/H");
    System.out.println("시속: " + obj1.getKey() + obj1.getValue());

    // Generic class의 type parameter value로는 반드시 참조형 타입이 와야한다.
    // 기초자료형(primitive type)은 절대 올 수 없다.
    // GenericPair<String,int> obj2 = new GenericPair<>("고길동", 30);
    // 타입 파라미터로 기초자료형의 배열은 올 수 있나?
    int[] jumsus = {90, 87, 88, 79, 93};
    GenericPair<String, int[]> obj3 = new GenericPair<>("6조 점수", jumsus);
    System.out.println(obj3.getKey());
  }
}

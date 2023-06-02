package lambda;

import anonymous.MyInterface1;

public class Test {
  public void test(MyInterface1 m1){
    m1.print("hello world");
  }

  public static void main(String[] args) {
    Test t = new Test();
  
    t.test((s)-> {
      System.out.println(s);
    });
  }

  public static int sum(int n1, int n2, int n3, add){
    int result = add(n1, n2);
    result = add(result, n3);
    System.out.println(result);
    return result;
  }
}



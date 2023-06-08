package generic;

import java.util.ArrayList;

public class CollectionTest {
  public static void main(String[] args) {
    // ArrayList<> 또한 제네릭 클래스 java.util package에 존재함
    ArrayList<String> names = new ArrayList<>();  
    names.add("대한");
    names.add("4김지");
    names.add("5김지");
    names.add("권지");
    names.add("효빈");
    names.add("성환");
    names.add("민재");

    for(String name : names) {
      System.out.println(name);
    }
    

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(10);
    ages.add(20);
    ages.add(30);
    ages.add(40);
    ages.add(50);
    ages.add(60);

    for(int age : ages) {
      System.out.println(age);
    }
  }
}

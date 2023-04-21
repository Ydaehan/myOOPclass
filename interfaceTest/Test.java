package interfaceTest;

import sortingAlgorithmTest.*;

public class Test {
  public static void main(String[] args) {
    // String s1, s2;
    // s1 = "BBC";
    // s2 = "ABD";
    // System.out.println(s1.compareTo(s2));

    Student std1, std2, std3, std4, std5;
    // std1 = new Student("일지매", "컴정");
    // std2 = new Student("홍길동", "컴정");
    // findLarger(std1, std2);

    Car c1,c2,c3,c4,c5;
    // c1 = new Car("HyunDai", "Granduer", 250, 5000);
    // c2 = new Car("GM", "Impala", 300, 4000);
    // c3 = new Car();
    // System.out.println(c3); // [브랜드:Unknown, 모델:Unknown, speed:0, price:0]
    // // findLarger(c1, c2);

    // Student[] stds = new Student[5];
    // std1 = new Student("일지매", "컴정");
    // stds[0] = std1;
    // std2 = new Student("홍길동", "컴정");
    // stds[1] = std2;
    // std3 = new Student("아무개", "컴정");
    // stds[2] = std3;
    // std4 = new Student("유대한", "컴정");
    // stds[3] = std4;
    // std5 = new Student("이순신", "컴정");
    // stds[4] = std5;

    // // polymorphism.Util.selectionSort(stds);
    // SortingUtil.SelectionSort(stds);
    // for (Student std : stds){
    //   System.out.println(std.getName());
    // }

    Car[] cars = new Car[5];
    c1 = new Car("HyunDai", "Grandeur", 250, 5000);
    cars[0] = c1;
    c2 = new Car("GM", "Impala", 300, 4000);
    cars[1] = c2;
    c3 = new Car("HyunDai", "Sonata", 250, 3500);
    cars[2] = c3;
    c4 = new Car("KIA", "K9", 300, 9000);
    cars[3] = c4;
    c5 = new Car("Benz", "E300", 300, 8000);
    cars[4] = c5;

    SortingUtil.SelectionSort(cars);
    for (Car car : cars){
      System.out.println(car);
    }
  }

  public static void findLarger(Comparable2 c1, Comparable2 c2){
    if (c1.compareTo(c2) == 0){
      System.out.println("같다.");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫번째가 크다.");
    } else {
      System.out.println("두번째가 크다");
    }
  }
}

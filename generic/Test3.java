package generic;

import java.util.*;

public class Test3 {
  public static void main(String[] args) {
    Student std1 = new Student("고길동", 77);
    Student std2 = new Student("길동", 87);
    Student std3 = new Student("동", 97);
    Student std4 = new Student("고길", 78);
    Student std5 = new Student("고", 79);

    List<Student> list = new ArrayList<>();
    list.add(std1);
    list.add(std2);
    list.add(std3);
    list.add(std4);
    list.add(std5);

    print(list);
    
    // Collections 의 sort 메서드는 List<T>
    // Collections.sort(list, new MyComparator());

    // lambda 
    System.out.println("정렬 후");
    Collections.sort(list,(s1, s2)-> s1.grade - s2.grade);
    print(list);
  }

  public static void print(List<Student> list) {
    for(int i = 0; i<list.size(); i++){
      // System.out.println(list.get(i));
      System.out.println("["+list.get(i).name+","+list.get(i).grade+"]");
    }
  }
}

class MyComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o1.grade - o2.grade;
  }
  
}

package sortingAlgorithmTest;

public class ComparableTest {
  public static void main(String[] args) {
    Student[] stds = new Student[5];
    stds[0] = new Student("유대한", "1901179");
    stds[1] = new Student("석진석", "2201363");
    stds[2] = new Student("김일곤", "2201330");
    stds[3] = new Student("이재일", "2201392");
    stds[4] = new Student("조현준", "1901276");
    SortingUtil.SelectionSort(stds);

    Professor[] profs = new Professor[5];
    profs[0] = new Professor("Kim");
    profs[1] = new Professor("Lee");
    profs[2] = new Professor("Park");
    profs[3] = new Professor("Choi");
    profs[4] = new Professor("Yoo");
    SortingUtil.SelectionSort(profs);

    for(Student std: stds){
      System.out.println(std);
    }

    for(Professor prof: profs){
      System.out.println(prof);
    }
  }
}

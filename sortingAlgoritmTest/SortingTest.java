package sortingAlgoritmTest;

import java.util.Random;

public class SortingTest {
  public static void main(String[] args) {
    int[] arr = new int[10];
    // 중복되지 않는 랜덤 수를 생성 해줌
    // System.currentTimeMillis()
    Random rdm = new Random(System.currentTimeMillis());
    for(int i = 0; i < arr.length; i++){
      arr[i] = rdm.nextInt(100);
    }
    System.out.println("정렬하기 전 : ");
    for(int val : arr) {
      System.out.print(val + " ");
    }
    System.out.println("\n정렬 후 : ");
    SortingUtil.SelectionSort(arr);
    for(int val : arr) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}

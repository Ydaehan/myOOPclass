package sortingAlgorithmTest;

import java.util.Random;

public class SortingTest {
  public static void main(String[] args) {
    int n = 10;
    int[] arr = new int[n];
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
    System.out.println();

    // 선택 정렬
    // SortingUtil.SelectionSort(arr);

    // 삽입 정렬
    // SortingUtil.InsertionSort(arr);

    // 버블 정렬
    // SortingUtil.BubbleSort(arr);

    // 퀵 정렬
    SortingUtil.QuickSort(arr, 0, n-1);
    System.out.println("\n정렬 후 : ");
    for(int val : arr) {
      System.out.print(val + " ");
    }
    
    System.out.println();
  }
}

package sortingAlgorithmTest;


public class SortingUtil {

  // SelectionSort (선택 정렬)
   public static void SelectionSort(int[] values){
    for(int i = 0; i < values.length; i++){
      int minIdx = i;
      for(int j = i+1; j < values.length; j++){
        // 현재까지 찾은 최소값(values[minIdx])과
        // values[j]를 비교해서 values[j]가 더 작으면
        // minIdx 를 j로 설정
        if(values[minIdx] > values[j]){
          minIdx = j;
        }
      }
    // minIdx의 값과 i의 값을 교환
      swap(i,minIdx,values);
    }
   }

   private static void swap(int idx1, int idx2, int[] values){
    int tmp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = tmp;
   }

   // insertion sort (삽입 정렬)
   public static void  InsertionSort (int[] values){
    int i, j, keyValue;
    int count = 0;
    for(i = 1; i < values.length; i++){
      // i+1 번째를 key value로 선정 후
      keyValue = values[i];
      count++;
      System.out.println("keyValue=" + keyValue);
      for(j = i-1; j >= 0 && values[j] > keyValue; j--){
        // 그 key value를 가지고 앞의 값과 비교하여
        // 앞의 값이 더 크면 뒤로 보냄 그리고 그 자리에 key value를 삽입
        values[j+1] = values[j];
        System.out.println("values[j+1]="+values[j+1]);
      }

      values[j+1] = keyValue;
      System.out.println(count +"번째 결과 : ");
      for(int k = 0; k < values.length; k++){
        System.out.print(values[k]+" ");
      }
      System.out.println("\n");
    }
   }

   // Bubble sort 
   public static void BubbleSort(int[] values){
    // 인접한 두 값을 비교하여 더 높은 수를 오른쪽으로 배치
    int count = 0;
    for(int i = 0; i < values.length; i++){
      count++;
      System.out.println(count + "번째 결과");
      for(int j = 1; j < values.length - i; j++){
        if(values[j-1] > values[j]){
          swap(j-1, j, values);
        }
      }

      for(int k = 0; k < values.length; k++){
        System.out.print(values[k]+" ");
      }
      System.out.println();
    }
   }

   // Quick sort
   public static int partition(int[] values, int left, int right){
    int pivot,low,high;
    low = left;
    high = right + 1;
    pivot = values[left];

    do{
      // values[low] 가 피벗보다 작으면 low 값을 증가
      do{
        low++;
      }while(low <= right && values[low] < pivot);

      // values[high] 가 피벗보다 크면 high 값을 감소
      do{
        high--;
      }while(high >= left && values[high] > pivot);

      // 만약 low 와 high가 교차하지 않았으면 values[low] 와 values[high] 교환
      if(low < high){
        swap(low, high, values);
      }
    }while(low < high);

    // low 와 high가 교차했으면 반복문을 빠져나와 values[left] 와 values[high] 를 교환
    swap(left, high, values);
    return high;
   }

   public static void QuickSort(int[] values, int left, int right){
    // left : 배열의 시작 = 0 right : 배열의 끝 = values.length - 1
    /* 
     * 1. 배열 안의 하나의 요소를 선택 -> 피벗 이라고 부름
     * 2. 피벗을 기준으로 피벗보다 작은 요소는 왼쪽으로 보다 큰 요소들은 오른쪽으로 옮김
     * 3. 피벗을 제외한 왼쪽 요소와 오른쪽 요소를 다시 정렬
     * 3-1. 분할된 부분 배열에 대하여 순환 호출을 이용하여 정렬을 반복
     * 3-2. 부분 배열에서도 다시 피벗을 정하고 피벗을 기준으로 2개의 부분 배열로 나누는 과정을 반복
     * 4. 부분 배열들이 더이상 분할이 불가능할 때 까지 반복
     * 4-1. 배열의 크기가 0 이나 1이 될때 까지 반복
     */

    // 정렬할 범위가 2개 이상의 데이터이면 (리스트의 크기가 0이나 1이 아니면)
    if(left < right){
      // partition 함수를 호출 -> 피벗을 기준으로 리스트를 비균등 분할 - 분할(Divide)
      int q = partition(values, left, right);

      // 피벗은 제외한 2개의 부분 리스트를 대상으로 순환 호출
      // (left ~ 피벗 바로 앞) 앞쪽 부분 리스트 정렬 -정복(Conquer)
      QuickSort(values, left, q-1);
      // (피벗 바로 뒤 ~ right) 뒤쪽 부분 리스트 정렬 -정복(Conquer)
      QuickSort(values, q+1, right);
    }
      
   }
}

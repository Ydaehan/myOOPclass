package test;

public class SafeArray {
  private int[] a;

  // a Array 의 배열 값을 설정하는 메서드
  public void createArray(int size){
    a = new int[size];
  }

  public void putValueInArray(int argIndex, int argValue){
    if(argIndex > 0 && argIndex < a.length){
      a[argIndex] = argValue;
      return; // return 혹은 else 문으로 밑의 err문이 출력되지 않게 막음
    }
    System.out.println("요청한 인덱스가 배열의 범위를 초과했습니다. 인덱스 : "+ argIndex);
    // -1 이라는 값은 위 배열에 존재 할 수 없다는 가정하에 return 값으로 지정
  }
  
  // a Array 의 특정 index 값을 읽어오는 메서드
  public int getValueInArray(int argIndex){
    if(argIndex > 0 && argIndex < a.length){
      return a[argIndex];
    }
    System.out.println("요청한 인덱스가 배열의 범위를 초과했습니다. 인덱스 : "+ argIndex);
    // -1 이라는 값은 위 배열에 존재 할 수 없다는 가정하에 return 값으로 지정
    return -1; 
  }

  public static void main(String[] args) {
    SafeArray array = new SafeArray();
    array.createArray(10);

    array.putValueInArray(2, 100);
    array.putValueInArray(10, 200);

    System.out.println(array.getValueInArray(2));
    System.out.println(array.getValueInArray(10));
  }
}

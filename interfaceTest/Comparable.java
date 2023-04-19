package interfaceTest;

public interface Comparable { // 실제로는 제네릭을 사용해서 정의한다
  int compareTo(Object other);  // -1, 0, 1 반환
}

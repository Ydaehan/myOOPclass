package sortingAlgorithmTest;

abstract public class Comparable {
  // comparable : 유사한
  // 내가 더 크면 1, anotherVal하고 값이 같으면 0, 내가 더 작으면 -1
  public abstract int compareTo(Comparable anotherVal);
}

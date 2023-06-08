package generic;

// 제네릭클래스의 파라미터는 여러개를 받을 수 있다.
public class GenericPair<T, V> {
  private T key;
  private V value;

  public GenericPair(T key, V value) {
    this.key = key;
    this.value = value;
  }

  public T getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}

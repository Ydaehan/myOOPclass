package generic;

public class Box {
  Object value;

  public Object getValue() {  // 값을 Object type으로 return 함
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }
}

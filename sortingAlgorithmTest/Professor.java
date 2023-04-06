package sortingAlgorithmTest;

public class Professor extends Comparable{
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Professor(String argName){
    name = argName;
  }

  @Override
  public String toString() {
    return "[ 이름: " + name + "]";
  }

  public int compareTo(Comparable anotherProf){
    Professor prof1 = (Professor)anotherProf;
    String anotherProfName = prof1.getName();
    return name.compareTo(anotherProfName);
  }
}

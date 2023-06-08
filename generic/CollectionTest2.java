package generic;
import java.util.*;

public class CollectionTest2 {
  public static void main(String[] args) {
    HashMap<String,Integer> nameAge = new HashMap<>();

    // HashMap 은 key 와 value의 쌍으로 data를 저장하고 key의 값으로 그에 대응되는 값을 인출
    nameAge.put("고길동", 20);
    int age = nameAge.get("고길동");
    System.out.println("고길동의 나이: " + age);

    nameAge.put("일지매", 30);
    nameAge.put("박문수", 40);

    age = nameAge.get("박문수");
    System.out.println("박문수의 나이: " + age);

    // 우리반의 조가 6개조가 있다.
    // 각 조의 조원들 이름을 HashMap을 이용해서 저장하고자 한다.
    // 즉, "1조" : ["이재일", "김지훈", "이주현", ...]
    // "2조" : ["홍길동", ....]

    HashMap<String, ArrayList<String>> classGroupStd = new HashMap<>();

    ArrayList<String> firstGroup = new ArrayList<>();
    ArrayList<String> secondGroup = new ArrayList<>();
    ArrayList<String> thirdGroup = new ArrayList<>();
    // ArrayList<String> fourthGroup = new ArrayList<>();
    // ArrayList<String> fifthGroup = new ArrayList<>();
    // ArrayList<String> sixthGroup = new ArrayList<>();
    // 1조 배열 값 추가
    firstGroup.add("이재일");
    firstGroup.add("김지훈(4)");
    firstGroup.add("이주현");
    firstGroup.add("하현진");
    firstGroup.add("임서연");
    firstGroup.add("장준호");
    
    // 2조 배열 값 추가
    secondGroup.add("김일곤");
    secondGroup.add("김범창");
    secondGroup.add("박수헌");
    secondGroup.add("김건우");
    
    // 3조 배열 값 추가
    thirdGroup.add("강주원");
    thirdGroup.add("김규민");
    thirdGroup.add("김동준");
    thirdGroup.add("박정민");
    thirdGroup.add("석진석");

    // hashmap에 넣기
    classGroupStd.put("1조", firstGroup);
    classGroupStd.put("2조",secondGroup);
    classGroupStd.put("3조", thirdGroup);

    printGroupMember("1조", classGroupStd);
    printGroupMember("2조", classGroupStd);
    printGroupMember("3조", classGroupStd);
  }
  public static void printGroupMember(String groupName, HashMap<String, ArrayList<String>> classGroupStd){
    ArrayList<String> members = classGroupStd.get(groupName);
    System.out.println(groupName + "의 멤버들");
    System.out.println("-----------------------");
    for( String member : members) {
      System.out.println(member);
    }
    System.out.println("-----------------------");
  }
}

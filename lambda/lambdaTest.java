package lambda;

import lambda.Person.Sex;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class lambdaTest {

  public static void main(String[] args) {
    LocalDate birthDate1 = LocalDate.of(2000, 10, 2);
    LocalDate birthDate2 = LocalDate.of(1990, 10, 12);
    LocalDate birthDate3 = LocalDate.of(2000, 10, 12);
    Person p1 = new Person("홍길동", birthDate1, Sex.MALE, "gdhong@gmail.com");
    Person p2 = new Person("일지매", birthDate2, Sex.FEMALE, "gmil@gmail.com");
    Person p3 = new Person("박문수", birthDate3, Sex.MALE, "mspark@gmail.com");

    // list는 인터페이스, 이 인터페이스를 구현하는 클래스로
    // ArrayList, LinkedList 등이 있다.
    // List<Person> list = new ArrayList<Person>();
    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    //  홍길동 : 20세?
    //  일지매 : 33세
    //  박문수 : 28세
    // printPersonWithinAgeRange(list, 28, 35);
    // System.out.println(p1.getAge());

    // printPersonOlderThan(list, 20);
    // printPersonsWithinAgeRange(list, 10, 20);

    // printPersons(list, new CheckPersonFemale18to25());

    // printPersons(list, new CheckPersonMale());
    // printPersons(list, new CheckPerson() {
    //     public boolean test(Person p) {
    //         return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <=25;
    //     }
    // });

    // printPersons(
    //   list,
    //   p -> p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25
    // );

    //  CheckPerson interface를 implements하는 class를 하나 생성해서
    //  printPersons method를 호출해라
    //  단, 이 메소드에 의해 출력되는 Person 객체는 성별이 남자인 객체이어야 한다.


    // 위와 같이 성별이 남자인 객체만 출력하도록
//  printPersons method를 호출하되, 무명클래스를 이용해봐라
//  CheckPerson interface를 구현하는 무명 클래스를 생성해 printPersons method를 호출하면 된다.
    // printPersons(list, new CheckPerson() {
    //   public boolean test(Person p) {
    //     return p.getGender() == Sex.MALE;
    //   }
    // });

    //  오직 하나의 추상메소드만 가지는 인터페이스 타입의 객체를 람다식으로 생성할 수 있다.
    //  람다식은 이름없는 메소드라 할 수 있다
    //  람다식을 이용하는 이유는 간결하기 때문이다.
    //  람다식을 이용하는 메소드가 필요한 곳에 간단히 메소들 보낼 수 있다.
    //  람다식은 오직 하나의 추상 메소드를 가지는 인터페이스 타입의 객체를
    //  요구하는 method의 인자로 전달될 수 있다.
    //  람다식의 문법
    //  (arg1, arg2, ...) -> { body }
    //  (type1 arg1, type2 arg2, ...) -> { body }

    //  위의 무명클래스를 람다식을 구현해보자

    //  printPersons(list, 
    //  (p) -> {return p.getGender() == Sex.MALE;}
    //  );

    // printPersons(list, (Person p) -> {return p.getGender() == Sex.MALE;});

    // 람다식의 body가 return문 하나만으로 구성되어 있으면 return keyword, {}, 문장 끝의
    // 세미콜론(;) 도 생략할 수 있다.
    // printPersons(list, (p) -> p.getGender() == Sex.MALE);

    // printPersons(list, p -> {
    //   System.out.println(p.getName());
    //   return p.getAge() >= 30;
    // });

    // 람다식을 이용해서 printPersons method를 호출하고,
    // 그 결과로 나이 20에서 30살 사이의 여자만 출력되도록 구현해라

    printPersons(list, (p) -> {
      return p.getGender() == Sex.FEMALE && (p.getAge() >= 20 && p.getAge() <= 30);
    });

    
  }

  // Approach 1: Create Methods That Search for Members That Match One Characteristic
  
  // collection framework : List, Set, Map, Stack, Queue
  // collection framework는 여러개의 값을 저장하는 자료구조
  // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다.
  // List<Person>, Set<Integer>, Map<String, Person>, ...
  public static void printPersonOlderThan(List<Person> persons, int age) {
    
    // persons List의 각 원소에 대해서 반복문을 수행
    // 각 원소를 Person타입의 변수 p에 저장
    for (Person p : persons) {
      if (p.getAge() > age) {
        p.printPerson();
      }
    }
  }
  // List<Person> list, int low, int high
  // 위 세개의 매개변수를 통해 Person 객체 리스트와, 나이의 범위(low 이상, high 미만)
  // 입력으로 받아, 저 나이 범위의 Person 정보만 출력하는 메소드
  // printPersonWithinAgeRange를 구현
  
  public static void printPersonWithinAgeRange(List<Person> list, int low, int high){
    for (Person p : list) {
      if (p.getAge() >= low && p.getAge() < high){
        p.printPerson();
      }
    }
  }
  
  // Person 객체의 리스트와 checkPerson 인터페이스를 구현한 객체를 전달받고,
  public static void printPersons(List<Person> list, CheckPerson tester) {
    for (Person p : list) {
      if (tester.test(p)) {
        p.printPerson();
      }
    }
  }

  public static void printPersonsWithPredicate(
    List<Person> roster,
    Predicate<Person> tester
  ) {
    for (Person p : roster) {
      if (tester.test(p)) {
        p.printPerson();
      }
    }
  }
}

interface CheckPerson {
  boolean test(Person p);
}

class CheckPersonFemale18to25 implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.FEMALE && p.getAge() >= 18 && p.getAge() <= 25;
  }
}

class CheckPersonMale implements CheckPerson {
  public boolean test(Person p) {
    return p.getGender() == Sex.MALE;
  }
}




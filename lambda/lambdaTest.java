package lambda;

import lambda.Person.Sex;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class lambdaTest {

  public static void main(String[] args) {
    LocalDate birthDate1 = LocalDate.of(2004, 10, 2);
    LocalDate birthDate2 = LocalDate.of(1990, 10, 12);
    LocalDate birthDate3 = LocalDate.of(1995, 10, 12);
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
    //  고길동 : 23세?
    //  일지매 : 28세
    //  박문수 : 35세
    printPersonWithinAgeRange(list, 28, 35);
    // System.out.println(p1.getAge());

    // printPersonOlderThan(list, 20);
    // printPersonsWithinAgeRange(list, 10, 20);

    // printPersons(list, new CheckPerson18to25());

    // printPersons(list, new CheckPerson() {
    //     public boolean test(Person p) {
    //         return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <=25;
    //     }
    // });

    // printPersons(
    //   list,
    //   p -> p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25
    // );
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
  // 
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

class CheckPerson18to25 implements CheckPerson {

  public boolean test(Person p) {
    return p.getGender() == Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
  }
}
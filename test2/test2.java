package test2;

import test.Person;

public class test2 {
  Person p = new Person();
  // 같은 package에 있지 않은 class 는 사용 불가
  // 사용 하기 위해서는 해당 class가 존재하는 파일을 import 해 주어야 한다.
  String d = p.dept; // 다른 package에서는 default access modifier or private access modifier
  // 로 지정되어있는 member variable은 접근 할 수 없다.

}

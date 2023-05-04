package interfaceTest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // ActionListener 라는 인터페이스를 사용할수 있게 해주는 라이브러리
import java.util.Scanner;

import javax.swing.Timer; // Timer 함수를 사용 할수 있게 해주는 라이브러리

class MyClass implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Beep");
  }
}

public class CallBackTest {
  public static void main(String[] args) {
    MyClass listener = new MyClass(); 
    // ActionListener Type이 아닌 
    // implements 클래스의 타입으로도 받아도 상관없다 (다형성)
    Timer timer = new Timer(1000, listener);
    timer.start(); // timer를 불러주어야 listener의 Action perform을 불러준다
    // for (int i = 0; i < 1000; i++){
    //   try{
    //   }
    // }

    Scanner input = new Scanner(System.in);
    System.out.println("Press Enter to quit");
    input.nextLine();
    input.close();
    System.out.println("Shut down Programs");
  }
}



package myTest;

import java.util.Scanner;

public class TensileStress {
  private double outPipe, inPipe;
  private double pipeThick;
  private double tensileForce, compression;
  private final double PI = 3.14;
  // 벤딩하는 각도
  private int bendingAngle;
  // r각도
  private int rAngle;
  // 메세지
  private String massage;
  // 값을 받아옴
  TensileStress(double argOutPipe, double argInPipe, int argRAngle, int argBendingAngle){
    outPipe = argOutPipe;
    inPipe = argInPipe;
    rAngle = argRAngle;
    bendingAngle = argBendingAngle;
    // 파이프 두께 = (파이프 외경 - 파이프 내경) / 2
    pipeThick = (outPipe - inPipe) / 2;
    calTensileForce();
    calCompression();
  }

  // 인장력 = (파이프 외경 / 2) * (파이프 두께 / R) 
  // * (180 - 각도) * (파이) / 180
  // 계산 
  public void calTensileForce(){
    tensileForce = (outPipe / 2.0) * (pipeThick / rAngle) * (180 - bendingAngle) * PI / 180;
  }
  // 압축력 = (파이프 내경 / 2) * (파이프 두께 / R)
  //  * (180 - 각도) * (파이) / 180
  public void calCompression(){
    compression = (inPipe / 2.0) * (pipeThick / rAngle) * (180 - bendingAngle) * PI / 180;
  }

  // 계산 결과 출력
  public void calculator(){
    Scanner scn = new Scanner(System.in);
    int select;
    boolean exit = true;
    while(exit){
      massage = "0. 인장력 계산 / 1. 압축력 계산 : ";
      System.out.print(massage);
      select = scn.nextInt();
      switch (select) {
        case 0:
          massage ="0번을 선택 하셨습니다. 결과를 출력합니다. 인장력 : ";
          System.out.println(massage + tensileForce);
          exit = false;
          break;
        case 1:
          massage ="1번을 선택 하셨습니다. 결과를 출력합니다. 압축력 : ";
          System.out.println(massage + compression);
          exit = false;
          break;
        default:
          massage = "잘못된 입력입니다. 다시입력하세요!";
          System.out.println(massage);
          break;  
      }
    }
    scn.close();
  }
}

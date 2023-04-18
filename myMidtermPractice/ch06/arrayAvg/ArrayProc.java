package myMidtermPractice.ch06.arrayAvg;

import java.util.Scanner;

public class ArrayProc {
  public void getValue(int[] array){
    Scanner scn = new Scanner(System.in);
    for(int i = 0; i < array.length; i++){
      System.out.print("성적을 입력하시오:");
      array[i] = scn.nextInt();
    }   
    scn.close();
  }

  public double getAverage(int[] array){
    double avg = 0;
    for(int i = 0; i < array.length; i++){
      avg = avg + array[i];
    }
    return avg / array.length;
  }
}

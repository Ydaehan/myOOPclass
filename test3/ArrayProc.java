package test3;

import java.util.Scanner;

public class ArrayProc {
  static void inc(int[] array){
    for(int i = 0; i < array.length; i++){
      array[i] = array[i] + 1;
    }
  }

  public static void getValue(int[] array){
    Scanner scn = new Scanner(System.in);
    for(int i = 0; i < array.length; i++){
      System.out.print("성적을 입력하시오:");
      array[i] = scn.nextInt();
    }
    scn.close();
  }

  public static double getAverage(int[] array){
    double total = 0;
    for(int i = 0; i < array.length; i++){
      total += array[i];
    }
    return total / array.length;
  }
}

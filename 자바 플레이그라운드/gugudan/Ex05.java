package gugudan;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
      // 배열로 구구단 구현
      int[] numArr = new int[9];
      
      for(int i = 2; i < numArr.length; i++) {
          numArr[i] = 2 * (i+1);
      }
      
      for(int i = 0; i < numArr.length; i++) {
          System.out.println(numArr[i]);
      }
      
      // 이중 for문
      for(int i = 2; i <= numArr.length; i++) {
          for(int j = 1; j <= 9; j++) {
              System.out.printf("%d * %d = %d\n", i, j, (i*j));
          }
      }
    }
}

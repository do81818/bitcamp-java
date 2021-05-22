package gugudan;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        
        // 6단
        int i = 1;
        while(i < 10) {
            System.out.printf("%d * %d = %d\n", 6, i, (6*i));
            i++;
        }
        
        // 7단
        for(int j = 1; j < 10; j++) {
            System.out.printf("%d * %d = %d\n", 7, j, (7*j));
        }
    }
}

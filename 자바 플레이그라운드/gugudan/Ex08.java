package gugudan;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userNumber = scanner.nextLine();
        String[] splitNumber = userNumber.split(",");
        
        int firstNum = Integer.parseInt(splitNumber[0]);
        int secondNum = Integer.parseInt(splitNumber[1]);
        
        for(int i = 2; i <= firstNum; i++) {
            for(int j = 1; j <= secondNum; j++) {
                System.out.printf("%d * %d = %d\n", i, j, (i*j));
            }
        }
    }
}

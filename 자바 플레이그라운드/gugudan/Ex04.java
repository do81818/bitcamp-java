package gugudan;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // 8단, 9단
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("구구단 숫자를 입력해주세요");
        int userInput = scanner.nextInt();
        while( !(userInput >= 2 && userInput <= 9) ) {
            System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
            userInput = scanner.nextInt();
        }
        System.out.println("number : " + userInput);
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", userInput, i, (userInput*i));
        }
    }
}

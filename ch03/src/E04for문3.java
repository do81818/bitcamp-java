import java.util.Scanner;

public class E04for문3 {
	public static void main(String[] args) {
		
//		Scanner scn = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int inputValue = scn.nextInt(); 
//		
//		int i;
//		
//		for (i = 1; i <= 9; i++) {
//			int j = inputValue * i;
//			System.out.println(inputValue + " X " + i + " = " + j);
//		}
	
		int i,j;
		
		for (i = 2; i <= 9; i++) { // 단수
			System.out.println(i + " 단");
			for (j = 1; j <= 9; j++) { // 곱수
				System.out.print(i + " * " + j + " = ");
				System.out.print(i * j + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("좋아하는 과일은 \n\"딸기\" 값은 \\1000원 입니다");
		
	}
}

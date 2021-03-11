import java.util.Scanner;

public class E03for문2 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		long sum = 0;
		
		System.out.print("정수 입력 : ");
		int inputValue = scn.nextInt();
		
		for (int i = 1; i <= inputValue; i++) {			
			sum += i;
			// sum에 i를 누적
		}
		
		System.out.println("결과값 : " + sum);
		
	}
}

import java.util.Scanner;

public class E02Scanner문 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); // 시험 (클래스 개수 세기)
		// 클래스는 변수라고 하지 않고 인스턴스라고 함
		
		System.out.print("정수 입력 : ");
		int i = scn.nextInt();		
		// System.out.println(i);
		for(int j = 1; j <= i; j++) {
			System.out.println(j);
		}
		
//		System.out.print("문자열 입력 : ");
//		String s = scn.nextLine();		
//		System.out.println(s);
		
		/*
		 	메소드
		 	정수 입력 : nextInt();
		 	문자열 입력 : nextLine();
		 */
	}
}

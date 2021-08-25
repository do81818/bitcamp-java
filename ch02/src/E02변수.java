public class E02변수 {
	public static void main(String[] args) {
		
		int score = 90; // 선언과 초기화를 동시에 함
		System.out.println("정수는 " + score + "점 입니다" ); // 문자열 결합시 + 기호를 이용한다.
		
		// byte b = 127; 
		// byte b = 128; // 오버플로우
		// System.out.println(b);
		
		int i; // 선언과 초기화를 나눠서 함
		i = 5; 
		System.out.println(score + i); // + 기호는 양옆이 숫자면 연산을 한다.
	}
}

/*
	2⁰ = 1
	2¹ = 2
	2² = 4
	2³ = 8
	2⁴ = 16
	2⁵ = 32 ✔
	2⁶ = 64 ✔
	2⁷ = 128
	2⁸ = 256 ✔
	2⁹ = 512
	2¹⁰ = 1024
	
	P 페타 E 엑사 Z 제타 Y 요타
	
	정수의 범위를 유추하지 못하면 알수없는 에러에 시달림
*/
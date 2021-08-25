public class E04변수크기 {
	public static void main(String[] args) {
		
		byte b = 127;
		char c = 'A'; // 'char' VS "String"
		short s = 100;
		int i = 100;
		long l1 = 100;
		// long l2 = 123456789012345;
		long l2 = 123456789012345L; // 리터럴(숫자, 문자)값도 대표변수형을 따른다.
		
		b += 1;
		System.out.println("b = " + b); // 오버플로우 에러 없이 오류값으로 출력 (-128)
		System.out.println("l2 = " + l2);
		
		c = 66; // (B) 유니코드 때문에 정수형에 슬쩍 낌
		c = 44033; // (각)
		System.out.println("c = " + c);
		
		// i = 10;
		// i = 012; // 012이 10으로 나오는 이유 : 0으로 시작하면 8진수(8의 제곱승으로 계산)
		i = 0xA; // 0xA이 10으로 나오는 이유 : 0x 으로 시작하면 16진수로 계산(16의 제곱승으로 계산)(그래픽에서 많이 사용)(0123456789ABCDEF..)
		System.out.println("i = " + i);
		
		float f = 3.14F;
		double d = 3.14;
		System.out.println("f = " + f);
		
		boolean bl = true;
		bl = (10 != 20); // 10과 20은 다르냐
		System.out.println("bl = " + bl);
		
		
		/*
		  대표적인 에러 2 가지
		  1. 문법에러
		  2. 로직에러 (컴파일러가 안알려줌)
		  
		  정수의 큰 숫자는 L 붙이기
		  실수를 쓸때 float 이면 F 붙이기
		*/
		
		// 추가
		
	}
}

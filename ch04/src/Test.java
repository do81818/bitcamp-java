public class Test {
	public static void main(String[] args) {
		
		/*
		int a = 1;
		
		for (int a = 1; a < 10; a++) {
			
		}
		*/
		// for 문 밖에서 선언된 int a 를 for 문에서 재선언 불가능
		
		/*
		int value;
		int result = value + 10;
		System.out.println(result);
		*/
		// 변수 int value 가 초기화되지 않았음으로 불가능
		
		/*
		 	클래스 변수, 메소드 변수
		*/
		
		boolean i = true;
		// int j = 1;
		
		if (i) {
			for (int j = 1; j <= 1; j++) {
				System.out.println("abc");

			}
			
			for (int j = 1; j <= 1; j++) {
				System.out.println("abc");
			}
		}
		
		/*
		 	
		 */
		
	}
}

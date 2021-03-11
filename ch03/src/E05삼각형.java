public class E05삼각형 {
	public static void main(String[] args) {
		
		// 삼각형
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		
		// 왼쪽 직각삼각형
//		for(int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		 // 피라미드
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		// 오른쪽 직각삼각형
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");				
//			}
//			System.out.println(" ");
//		}
		
	}
}

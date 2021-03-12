import java.util.Arrays;

public class E03다차원배열 {
	public static void main(String[] args) {
		
		// 복습
//		int[] a = {10, 20, 30};
////		System.out.println("배열의 개수 : " + a.length);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + "\t");
//		}
		
		
		// 다차원 배열
		int[][] a1 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {15, 25, 35}};
		for (int i = 0; i < a1.length; i++) { // 행의 개수
			for (int j = 0; j < a1[0].length; j++) { // 열의 개수
				System.out.print(a1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		/*
		 	0 차원 = 변수
		 	1 차원 = 배열명.length 방개수
		 	2 차원 = 배열명[행].length 열
		 */
	}
}

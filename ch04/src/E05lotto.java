import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;

public class E05lotto {
	public static void main(String[] args) {
		
		/*
		 	1. 배열 생성
		 	2. 첫번째 공 뽑기
		 	
		 	3. 2 ~ 6 번째 공 뽑기
		 	3-1. 뽑은 번호가 배열에 있는 번호랑 같으면 중복검사 종료
		 	4. 중복검사를 통과했으면 배열에 확정 or 번호 다시 뽑음
		 	
		 	3 ~ 4 반복
		 	
		 	
		*/
		
		// 뽑은 번호 보관
		int[] a = {0, 0, 0, 0, 0, 0};
		// 지난주 로또 번호
		int[] b = {7, 9, 22, 27, 37, 42};
		
		long money = 0;
		
		do {
			// 번호 6개 뽑기
			int r = (int)(Math.random() * 45) + 1; 
			a[0] = r; // 첫째공
			
			// 2번째 부터 6번째 공을 추출
			for (int i = 1; i < 6; i++) {
				r = (int)(Math.random() * 45) + 1;
				int j;
				
				for (j = 0; j < i; j++) { // 처음부터 직전 방까지 중복검사
					if (r == a[j]) { // 중복이면
						break; // 뒤는무시
					}
				}
				
				if (j == i) { // 무사통과
					a[i] = r; // 배열확정
				} else { // 중복발생
					--i;
				}
			}
			
			// 배열 정렬
			int temp; // 임시
			for (int i = 0; i < a.length; i++) { // i 비교 기준
				for (int j = i + 1; j < a.length; j++) { // j 비교 대상
					if (a[i] > a[j] ) { // 역순이냐?
						temp = a[i]; // 바꿔치기
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			
			
			
			// 배열 값을 출력
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + "\t");
			}
			
			money += 1000; // 게임한판
			
			// DecimalFormat
			DecimalFormat comma = new DecimalFormat("#,###");
			System.out.println(comma.format(money) + " 원"); 
			
			
		} while (Arrays.equals(a, b) == false); // 꽝이면 반복
		
		// 당첨시 처리
		System.out.println("대박이야!!");
		
		// 시간 출력하기
		Date d = new Date(System.currentTimeMillis());
		System.out.println("당첨날짜 시간 출력 : " + d);
	}
}

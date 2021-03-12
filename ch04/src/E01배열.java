public class E01배열 {
	public static void main(String[] args) {
		
//		int a = 83;
//		int b = 90;
//		int c = 87;
//		int sum = a + b + c;
//		System.out.println("점수 합계 : " + sum);
//		System.out.println("점수 평균 : " + sum / 3.);
		
		
		// 배열 선언
//		int[] a = {83, 90, 87, 95, 99, 100}; // 자바의 배열은 같은 타입은 데이터만 들어갈 수 있다.
//		int a1[] = {83, 90, 87};
		
		
		
		// 배열의 초기화를 나중에 해야하는 경우에 사용. 
		int[] a;
		a = new int[] {83, 90, 87, 95, 99, 100};
		
		
		
		System.out.println(a.length); // .length 프로퍼티는 괄호가 없다.
		
		// 변수 읽기
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]); // 컴파일 후에 에러가 나옴 (인덱스의 범위 초과)
//		int sum = a[0] + a[1] + a[2];
		
		// 순회
		int sum = 0;	
		for (int i = 0; i < a.length; i++) { // 배열 전체 대상
			sum += a[i];
		}
		System.out.println(sum);
	
	}
}

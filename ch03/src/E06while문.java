public class E06while문 {
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		while (sum <= 100) {
			sum += i++;
			// ++i
		}
		System.out.println(sum);
		
		/*
		  언제 끝날지 모를때 사용 (횟수기약x)
		*/
	}
}

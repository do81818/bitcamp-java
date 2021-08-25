public class E07while문2 {
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		// A
//		while (true) {
//			sum += i++;
//			if (sum > 10)
//			break; // 인접순환을 탈출하고 밑으로 내려간다.
//		}
		
		// B
		boolean b = true;
		while (b) {
			sum += i++;
			if (sum > 10) {
				b = false;
			}
		}
		System.out.println(sum);
	}
}

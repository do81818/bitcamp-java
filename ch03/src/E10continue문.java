public class E10continue문 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0) {
				continue;
				// break 인접순환 탈출 후 아래로
				// continue 인접순환 탈출 후 위로(헤더로)
			}
			System.out.println(i);
		}
	}
}

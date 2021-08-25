public class E06연산자 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a%b); // 나머지
		
		boolean c = true;
		System.out.println(!c); // false (NOT 연산자)
		
		System.out.println(false && true); // AND 연산자 (두 항목이 true 여야 true)
		
		System.out.println(true || true); // OR 연산자 (둘 중에 true 가 있으면 true)
		
		System.out.println((10==20) || (30!=40)); // true
		
		// & 또는 | 는 비트연산자
		// >> 또는 << 는 쉬프트 연산자 (그래픽에서 상변환)
	}
}

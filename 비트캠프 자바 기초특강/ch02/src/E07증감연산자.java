public class E07증감연산자 {
	public static void main(String[] args) {
		
		// 복습
		int i = 10;
		int j = 20;
		
		System.out.println(i);
		
		// i는 1증가
		// i = i + 1;
		// i += 1;
		// ++i;
		System.out.println(i);
		
		// j는 1감소
		// j = j - 1;
		// j -= 1;
		// --j;
		System.out.println(j);
		
		
		// 증감연산자
		// i++;
		// System.out.println(++i); // 위치가 앞에 있기 때문에 전위 연산자라고 한다. (먼저 변신)
		// System.out.println(i++); // 후위 연산자 (나중 변신)
		// System.out.println(i);
		
		// j--;
		// System.out.println(j);
		// 값은 같지만 내부적인 작동이 다름
		
		// System.out.println(++i + j--); // 11 + 20 (아래 코드와 동일)
		i = i + 1;
		System.out.println(i + j);
		j = j - 1;
	}
}

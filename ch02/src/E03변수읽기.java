public class E03변수읽기 {
	public static void main(String[] args) {
		
		int i = 10;
		int j;
		
		j = i + 10; // = 우변에서 좌변으로 대입
		System.out.println(j);
		
		// j = j + 1;
		// j += 1;
		// j *= 2; // 이퀄나중
		++j;
		System.out.println(j);
		
		System.out.println(i == j); // false
	}
}

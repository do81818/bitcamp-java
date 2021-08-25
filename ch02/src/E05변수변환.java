public class E05변수변환 {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // 자동 형 변환 (큰 타입으로 작은 타입을 넘김)
		System.out.println(i);
		
		int i1 = 44032;
		// char c = i1; // 작은 타입에 큰 타입을 넣는 것은 안됨
		char c = (char) i1; // 큰 타입을 작은 타입으로 바꾸려면 값 앞에 (타입명) 으로 강제 형 변환 해주어야 함
		System.out.println(c);
		
		int i2 = 10;
		int i3 = 3;
		int i4 = i2 / i3; // 몫
		int i5 = i2 % i3; // 나머지
		double d = i2 / i3; // 3.0
		
		// double d1 = (double) i2 / (double) i3; // 3.3333 ...
		// double d1 =  (double) i2 / i3; // 둘 중 하나만 형변환이 되면 된다.
		double d1 = 10.0 / 3; // (정수 / 정수) 만 아니면 됨
		System.out.println(d1);
	}
}
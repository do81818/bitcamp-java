public class E02main {
	public static void main(String[] args) {
		
//		String s1 = "홍길동";
//		String s1;
//		s1 = new String("홍길동");
//		System.out.println(s1);
		
		
//		String[] s2 = {"홍길동", "홍길순", "고길동"};
//		System.out.println(s2[2]);
		
//		System.out.println(args[0] + args[1]); // 실패
		
		if (args.length != 2) {
			System.out.println("두 개의 정수를 같이 입력하세요");
			System.exit(0); // System.exit(0) 프로그램 종료
		}
		
		int i = Integer.parseInt(args[0]); // parseInt() 메서드로 정수 <- 문자열
		int j = Integer.parseInt(args[1]);
		System.out.println(i + j);
		
		
	}
}

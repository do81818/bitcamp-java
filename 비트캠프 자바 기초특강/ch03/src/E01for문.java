public class E01for문 {
	public static void main(String[] args) {
		
//		int i;
		
		
//		for (int i = 1; i <= 10; i++) { // 현업에선 = 잘 안씀, 후위 증감을 많이 쓴다. 
//		for (i = 2; i < 11; i += 2) { 
//			System.out.println(i);
//		}
		
//		System.out.println(i); 
		
		
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
//			System.out.println("발사");
		} // 전역변수가 있을때 지역변수로 같은 변수명 지을수 없음\
		System.out.println("발사");
	}
}

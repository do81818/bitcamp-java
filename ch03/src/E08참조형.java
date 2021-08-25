public class E08참조형 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc"); // 새공간 확보
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// 주소 비교
		System.out.println(s1==s2); // true
		System.out.println(s1==s3); // false
		// 포인터가 다른 메모리를 가르킴 (인스턴스) 
		// 자바에서는 가비지컬렉터가 메모리를 관리해준다(읽기전용)
		
		// 값 비교
		System.out.println(s1.equals(s3)); // true
	}
}

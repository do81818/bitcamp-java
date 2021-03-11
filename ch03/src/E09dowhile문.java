import java.util.Scanner;

public class E09dowhile문 {
	public static void main(String[] args) {
		
		/*
		// 사용자가 특정 문자를 찍을때까지 물어봄
		System.out.print("q를 입력하면 종료 : ");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		// System.out.println(str);
		while (!str.equals("q")) {
			System.out.print("q를 입력하면 종료 : ");
			str = scn.nextLine();
		}
		System.out.println("종료합니다.");
		*/
		
		Scanner scn = new Scanner(System.in);
		String str;
		do {
			System.out.print("q를 입력하면 종료 : ");
			str = scn.nextLine();
		} while (!str.equals("q"));
		System.out.println("종료합니다.");
		
		// do while 은 검사를 뒤에서 한다. (로그인 이외에 거의 안씀)
	}
}

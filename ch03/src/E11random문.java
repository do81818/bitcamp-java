import java.util.Scanner;

public class E11random문 {
	public static void main(String[] args) {
		
		/*
		int i = (int)(Math.random() * 3)+1;
		System.out.println(i);
		// 인스턴스를 생성하지 않고 사용 가능한 예외적인 클래스가 있음
		*/
		
		int r = (int)(Math.random()*100)+1;
		int score = 100;
		int i;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("1 ~ 100 값을 맞춰보세요 : ");
		do {
			i = scn.nextInt();
			if (i == r) {
				System.out.println("\n정답!" + score + "점 입니다!");
				break;
			} else if (i < r) {
				System.out.print("너무 작습니다.\t");
				score -= 10;
			} else {
				System.out.print("너무 큽니다.\t");
				score -= 10;
			}
			// score -= 10;
			if (score == 0) {
				System.out.println("아쉽지만 " + score + " 점 입니다 ㅠㅠ");
				break;
			}
		} while (true);
	}
}

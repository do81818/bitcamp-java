public class E12switch문 {
	public static void main(String[] args) {
		
		int i = 5;
		
		/*
		if (i == 1) {
			System.out.println();
		} else if (i == 2) {
			
		}
		*/
		
		System.out.print(i + "월은 ");
		switch (i) {
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.print("31");
				break;
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				System.out.print("30");
				break;
			case 2 :
				System.out.print("28");
				break;
			default :
				System.out.print("1 ~ 12 사이만 입력");
		}
		System.out.print("입니다.");
	}
}

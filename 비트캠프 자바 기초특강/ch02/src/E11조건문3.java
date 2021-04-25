public class E11조건문3 {
	public static void main(String[] args) {
		
		int i = 99;
		
		if (i >= 90) {
			if (i >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (i >= 80) {
			System.out.println("B");
		} else if (i >= 70) {
			System.out.println("C");
		} else if (i >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		// 중첩이프 (비추)
	}
}

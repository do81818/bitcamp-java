import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {

		int[] a = {0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i < a.length; i++) {
			
			int r = (int)(Math.random() * 45) + 1;
			int j;
			
			for (j = 0; j < i; j++) {
				if (r == a[j]) {
					break;
				}
			}
			
			if (j != i) {
				--i;
				continue;
			}
			
			a[i] = r;
		}
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
	}
}

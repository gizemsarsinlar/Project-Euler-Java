
public class ProjectEuler2 {
	public static void main (String args []) {
		int sum = 0;
		int a = 0;
		int b = a + 1;
		int c = a + b;
		while (c < 4000000) {
			if (c % 2 == 0) {
				sum = sum + c;	
			}
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(sum);
	}
}

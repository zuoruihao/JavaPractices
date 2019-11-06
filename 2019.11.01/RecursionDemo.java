public class Recursion {
	public static int an(int n) {
		if (n == 1) {
			return 1;
		} else {
			return an(n) * an(n - 1);
		}
	}
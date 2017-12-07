import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int a[] = new int[5];
		fillArrayRand(a);

	}

	private static void fillArrayRand(int[] a) {
		Random r = new Random();
		int t = 0;
		for (int i = 0; i < 10; i++) {
			t = r.nextInt(20);
			a[t] = i;
		}
	}
}
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			fillArrayRand(a);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fehler!");
		}
	}

	private static void fillArrayRand (int[] a) throws Exception {
		Random r = new Random();
		int t = 0;
		try {
			for (int i = 0; i < 10; i++) {
				t = r.nextInt(20);
				a[t] = i;
			}
		} catch (Exception e) {
			;
		}
	}
}
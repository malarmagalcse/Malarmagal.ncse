package guvi;

public class PrimeRange {

	public static void main(String[] args) {
		int i, loopvar;
		int count1 = 0;
		int[] array1 = new int[100];
		for (i = 2; i < 100; i++) {
			for (loopvar = 2; loopvar < i; loopvar++) {
				if (i % loopvar == 0) {
					break;
				}
			}
			if (i == loopvar) {
				array1[count1] = i;
				count1++;
			}
		}
		int m, n = 0, n1;
		for (i = 0; i < count1 - 1; i++) {
			int total = 0;
			n1 = array1[i];
			if (n1 > 9) {
				n = n1;
			}
			while (n != 0) {
				m = n % 10;
				total = total + m;

				n = n / 10;
			}
			for (loopvar = 2; loopvar < total; loopvar++) {
				if (total % loopvar == 0) {
					break;
				}
			}
			if (total == loopvar) {
				System.out.println("" + total);
			}

		}
	}
}

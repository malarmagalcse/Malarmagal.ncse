package numberBased;

public class PowerOfLastDigit {
	public static void power(int input) {
		int num = input;
		int sum = 0;
		int len = Integer.toString(num).length();
		//System.out.println(len);
		int[] digit = new int[len];
		for (int i = 0; i < len; i++) {
			digit[i] = num % 10;
			num = num / 10;
		}
		for (int i = 0; i < len; i++) {
			int pow = 1;
			int l = len;
			while (l > 0) {
				pow *= (digit[len - (i + 1)]);
				l--;
			}
			int power = pow;

			sum = sum + power;

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		power(1234);

	}

}

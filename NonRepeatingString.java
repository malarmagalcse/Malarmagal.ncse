package guvi;

import java.util.Scanner;

public class NonRepeatingString {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = "";
		int count = 0;
		str = sc.nextLine();
		char[] st = str.toCharArray();
		str = sc.nextLine();
		for (int i = 0; i < st.length - 2; i++) {

			for (int j = i + 1; j < st.length; j++) {
				if (st[i] == st[j]) {
					break;

				}
			}
			count++;

		}
		System.out.println(count);
	}

}

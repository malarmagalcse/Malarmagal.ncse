package handsOn.One;

import java.util.Scanner;

public class RejectRepeat {

	public static void main(String[] args) {
		int flag, k = 0,num=0;
		char[] chr = new char[10];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		for (int i = 0; i < str.length(); i++) {
			flag = 0;
			for (int j = i+1; j <str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = 1;
				}

			}
			if (flag == 0) {
				chr[k] = str.charAt(i);
				k++;
				num++;
			}
		}

		System.out.println("The required string is: ");
		for (int i = num; i >=0; i--) {
			System.out.print(chr[i]);
		}
		s.close();

	}

}

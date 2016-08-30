package guvi;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = s.nextLine();
		System.out.println("Enter the string to be checked as a substring");
		String str2 = s.nextLine();
		if (str1.contains(str2)) {
			System.out.println("b is a substring of a");
		} else {
			System.out.println("b is not a substring");
		}
		s.close();
	}

}

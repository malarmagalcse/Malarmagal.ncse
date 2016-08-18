package Guvi;

import java.util.Scanner;

public class Fact {
	public int facto(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * facto(n - 1);
		}
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = s.nextInt();
		
		System.out.println("Factorial value is: " + factorial.facto(num));
		s.close();
	}

}

package lc1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		if(num<0){
			System.out.println("The number is negative");
		}
		else if(num==0){
			System.out.println("The number is zero");
		}
		else{
			System.out.println("The number is positive");
		}
		s.close();
	}

}

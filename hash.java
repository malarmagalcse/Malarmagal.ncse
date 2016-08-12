package guvi;

import java.util.Scanner;

public class Hash {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of rows to be printed");
		int len=s.nextInt();
		for(int i=0;i<len;i++){
			for(int k=i;k<len/2+10;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("#");
			}
			System.out.println();
		}
		s.close();
	}

}

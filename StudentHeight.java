package Guvi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentHeight {

	public static void main(String[] args) {
	stuHeight();
	}
		public static void stuHeight(){
		Scanner scr=new Scanner(System.in);
	int[] height=new int[50];
	System.out.println("Enter 50 Students height");
	for(int i=0;i<50;i++){
		height[i]=scr.nextInt();
	}
Arrays.sort(height);
System.out.println("4 th Height "+height[height.length-4]);
System.out.println("Enter K value");
int k=scr.nextInt();
System.out.println("k th Height"+height[height.length-k]);
	}

}

package guvi;

import java.util.Scanner;

public class CountVowels {
	
	public static void main(String[] args) {
	        String str;
	        @SuppressWarnings("resource")
			Scanner in=new Scanner(System.in);
	        str=in.nextLine();
	        str.toLowerCase();
	        int cnt=0;
	        for(int i=0;i<=str.length()-1;i++){
	           char ch=str.charAt(i);
	            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	                cnt++;
	        }
	        System.out.println(cnt);
	}
}

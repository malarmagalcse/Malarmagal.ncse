package guvi;

import java.util.Scanner;

public class LargestSubString {

    @SuppressWarnings("null")
	public static void main(String[] args) {
        
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	String str=scanner.next();
	String sub = null;int c,l=str.length();
        for(int pos=1;pos<l;pos++){
	   c=str.charAt(pos)-str.charAt(pos-1);
	      if(c!=-1){
			 sub=str.substring(pos);
			 break;	}
	if(sub.length()!=0)
          System.out.println("Lexographic Substring:"+sub);
	
	else
	  System.out.println("no lexographic String can be formed");
    }}}

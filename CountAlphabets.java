package lc.one;

public class CountAlpha {

	public static String output;
	public static int countAlpha(String input){
		int count=0;
		String str=input;
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 && str.charAt(i)<=122)){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countAlpha("abc123#$%^bg67*"));
		
	}

}

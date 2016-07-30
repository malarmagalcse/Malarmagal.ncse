package lc.one;

public class Count {

	public static String output;
	public static int countAlpha(String input){
		int count=0;
		String string=input;
		for(int i=0;i<str.length();i++){
			if((string.charAt(i)>=65 && string.charAt(i)<=90)||(string.charAt(i)>=97 && string.charAt(i)<=122)){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countAlpha("abc123#$%^bg67*"));
		
	}

}

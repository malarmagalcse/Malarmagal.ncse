package lc.one;

public class PrintEquivalent {
	public static void printEqivalent(String s){
		String[] num=s.split(" ");
		int a=Integer.parseInt(num[0]);
		int b=Integer.parseInt(num[1]);
		
		System.out.println(Integer.toBinaryString(a)+" "+Integer.toBinaryString(b));
	}

	public static void main(String[] args) {

		printEqivalent("2 4");
	}

}

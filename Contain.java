package guvi;
import java.util.Scanner;


public class Contain
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1="Hello World";
		System.out.println("Enter thr string to find");
		String c=s.next();
		boolean b=true;
		
		for(int i=0;i<s1.length();i++)
		{
		if(s1.contains(c))
		{
			System.out.println(b);
			break;
		}
		else
		{
			System.out.println("false");
			break;
		}
	}

}
}

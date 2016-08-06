import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String s=scan.nextLine();
		String s1[]=s.split(" ");
		String result=" ";
		
		for(int i=0;i<s1.length;i++)
		{
			String sb1=new String(s1[i]);
			int len=sb1.length();
			int[] flag=new int[len];
			for(int j=0;j<len;j++)
			{
				if(sb1.charAt(j)<97)
					flag[j]=1;
			}
		
		String s2=sb1.toLowerCase();
		StringBuffer sb2=new StringBuffer(s2);
		sb2.reverse();
		for(int j=0;j<len;j++)
		{
			if(flag[j]==1){
				sb2.CharAt(j)=sb2.charAt(j)-32;
			}
		}
		result+=" "+sb2;
		}
	System.out.println(result.trim());
}	}

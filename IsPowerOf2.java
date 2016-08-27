package guvi;
import java.util.Scanner;

public class IsPowerOf2 {

	
	public static void main(String[] args) {
		System.out.println("Enter a value:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num!=2 && num%2==0)
		{
			num/=2;
		}
		if(num==2){
			System.out.println("Given number is power of 2");
		}
		else{
			System.out.println("Given number is not a power of 2");
		}
  s.close();
	}

}

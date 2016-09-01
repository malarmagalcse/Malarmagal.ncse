package guvi;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		System.out.println("Enter the no of switches:");
		int n=0;
		int count=2;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		boolean swt[]=new boolean[n];
		for(int i=0;i<n;i++){
			swt[i]=true;
					}
	swt[n-1]=false;
		for(int j=n-1;j>1;j--){
			if(swt[j]==false){
				swt[j-1]=true;
				count++;
				swt[j-2]=false;
				count++;
				}
			else if(swt[j]==true){
				swt[j]=false;
				count++;
				swt[j-1]=true;
				count++;
				swt[j-2]=false;
				count++;
			}
		}
		for(int i=1;i<n-1;i++){
			swt[i+1]=true;
			count++;
			swt[i]=false;
			count++;
		}
		swt[n-1]=false;
	System.out.println("Minimum switchings required:"+count);
	}
}

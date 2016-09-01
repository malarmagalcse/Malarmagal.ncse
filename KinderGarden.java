package guvi;

import java.util.Scanner;

public class KinderGarden {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
	int i,j,n,noc,nod,asc=97,days;;
	char[] name=new char[100];
	System.out.println("Enter the value n ");
	Scanner scr=new Scanner(System.in);
	n=scr.nextInt();
	noc=2*n;
	nod=noc-1;
	/* Assigning the name for each child */
	for(i=0;i<noc;i++)
	{
	name[i]=(char) asc;
	asc++;
	}
	days=nod;
	j=2*n-1;
	while(days!=0)
	{
	System.out.println("\n The children pairs for day %d"+days);

	for(int i1=0;i1<2*n;i1++)
	{
	System.out.println(name[i1]+name[j]);
	j--;
	}
	
	for(int i1=0;i1<2*n;i1++)
	{
	char temp = 0;
	if(i1==0)
	{
	temp=name[i1];
	}
	name[i1]=name[i1+1];
	if(i1==(2*n)-1)
	{
	name[i1]=temp;
	}
	}
	days--;
	}
	}
}


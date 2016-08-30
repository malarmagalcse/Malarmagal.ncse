package guvi;

public class CheckIsSorted {

	public static void main(String[] args) {
	
		int[] a={1,2,3,4,5};
		int count=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				count++;
			}
		}
		if(count==a.length-1)
		{
			System.out.println("Sorted Order");
		}
		else
		{
			System.out.println("Unsorted Order");
		}
	
	}

}

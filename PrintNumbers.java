package day.one;

public class PrintNumbers {
	int i=1;
	public void printNum(int n){
		
		if(i<=n){
			System.out.println(""+i);
			i++;
			printNum();
		}
	}


	public static void main(String[] args) {
		PrintNumbers printNumbers = new PrintNumbers();
		printNumbers.printNum(100);

	}

}

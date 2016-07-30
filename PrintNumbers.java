package day.one;

public class PrintNumbers {
	int i=1;
	public void printNum(){
		
		if(i<=100){
			System.out.println(""+i);
			i++;
			printNum();
		}
	}


	public static void main(String[] args) {
		PrintNumbers printNumbers = new PrintNumbers();
		printNumbers.printNum();

	}

}

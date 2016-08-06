package numberBased;

public class PowNext {
	public static void power(int input) {
		int num = input;
		int sum = 0;
		int len = Integer.toString(num).length();
		int[] digit = new int[len];
		for (int i = len - 1; i >= 0; i--) {
			digit[i] = num % 10;
			num = num / 10;
			System.out.print(" " + digit[i]);
		}
		for (int i = 0; i <len; i++) {
			if(i==len-1){
				int pow=1;
				int l=1;
				while(l<=(digit[0])){
				 pow = (digit[len-1]) *pow ;
				 l++;
				}
				//System.out.println("\n"+digit[len-1]+" "+(digit[0]));
				//System.out.println(pow);
				int power = pow;
				sum = sum + power;
				break;
			}
			int pow=1;
			int l=1;
			while(l<=(digit[i +1])){
			 pow = (digit[i]) *pow ;
			 l++;
			}
			
			//System.out.println("\n"+digit[i]+" "+(digit[i + 1]));
			//System.out.println(pow);

			int power = pow;
			sum = sum + power;

		}
		System.out.println("\n" + sum);

	}

	public static void main(String[] args) {
		power(4165);

	}

}

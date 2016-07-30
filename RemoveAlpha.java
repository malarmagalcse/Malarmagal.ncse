package lc.one;

public class RemoveNumbers {
	public static String output;
	
	public static String remove(String input){
		String op="";
		int length=input.length();
		
		char[] inputArr=new char[length];
		char[] outputArr=new char[length];
		
		for(int i=0;i<length;i++){
			inputArr[i]=input.charAt(i);
		}
		int x=0;
		for(int i=0;i<inputArr.length;i++){
			if((inputArr[i]>=65 && inputArr[i]<=90)||(inputArr[i]>=97 && inputArr[i]<=122)){
				continue;
			}
			else{
				outputArr[x]=inputArr[i];
				x++;
			}
		}
		for(int i=0;i<outputArr.length;i++){
			op=op+outputArr[i];
		}
		output=op;
		return output;
	}

	public static void main(String[] args) {
		System.out.println(remove("AA123BB"));
		
	}

}

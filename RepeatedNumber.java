package demo.programs;

public class RepNum {

	public static void main(String[] args) {
		int[] numArr={2,7,31,44,19,2,33,78,62};
		int flag=0;
		int i,j;
		for(i=0;i<numArr.length;i++){
			for(j=0;j<numArr.length;j++){
				if(numArr[i]==arr[j]){
					flag=1;
				}
			}
			if(flag==1){
				break;
			}
		}
		System.out.println(numArr[i]);
	}

}

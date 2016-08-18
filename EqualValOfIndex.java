package guvi;

public class EqualValOfIndex {
	public static int equalIndex(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if (i == input[i]) {
				return input[i];
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		int [] arr=new int[]{2,3,2,4,6,7,8};
		System.out.println(equalIndex(arr));
	}

}

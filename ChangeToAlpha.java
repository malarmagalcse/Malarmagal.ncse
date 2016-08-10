package lc.one;

public class ChangeToAlpha {
	public static void changeToAlpha(int no) {
		int[] dig = new int[Integer.toString(no).length()];
		int j=0;
			while (no % 10 != 0) {
				dig[j] = no % 10;
				no = no / 10;
				j++;
			}
		
		String result = "";
		for (int i = 0; i < dig.length; i++) {
			char c = (char) (dig[i] + 96);
			result = result + c;
		}
		StringBuffer stringBuffer=new StringBuffer(result);
		System.out.println(stringBuffer.reverse());
	}

	public static void main(String[] args) {
		changeToAlpha(1234);
	}

}

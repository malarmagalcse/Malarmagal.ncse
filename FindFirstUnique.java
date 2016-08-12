package lc.one;

import java.util.HashMap;
import java.util.Scanner;

public class FindFirstUnique {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		char[] strarr = str.toCharArray();
		char c;
		for (int i = 0; i < strarr.length; i++) {
			c = strarr[i];
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int i = 0; i < strarr.length; i++) {
			c = strarr[i];
			if (map.get(c) == 1){
				System.out.println(c);
			break;
			}
		}
	}
}

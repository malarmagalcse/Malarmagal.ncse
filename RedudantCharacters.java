package guvi;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class RedudantCharacters {

	public static void main(String[] args) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
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
		String required = "";

		for (Character key : map.keySet()) {
			required += key;
			//map.get(key);
			//System.out.print(key + "" + map.get(key));
		}
		System.out.println(required);
	}

}

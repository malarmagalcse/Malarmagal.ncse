package guvi;

import java.util.Stack;

public class BalanceParanthesis {
	public static int noOfBalancedParanthesis(String str) {
		int count = 0;
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (s.isEmpty()) {
				s.push(c);
			} else {
				if (c == '(' && s.peek() == '(') {
					s.push(c);
				} else if (c == '(' && s.peek() == ')') {
					s.pop();
					count++;
				}
				else if(c == ')' && s.peek() == '('){
					s.pop();
					count++;
				}
				else if(c == ')' && s.peek() == ')'){
					s.push(c);
				}
			}
		}
		
		return (count * 2);
	}

	public static void main(String[] args) {

		System.out.println(noOfBalancedParanthesis(")()())"));
	}

}

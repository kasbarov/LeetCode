package Easy;

import java.util.Stack;

public class ValidParentheses_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("]"));
	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);

			switch (letter) {
			case '(':
			case '{':
			case '[':
				stack.push(letter);
				break;

			case ')':
				if (!stack.empty() && stack.peek() == '(')
					stack.pop();
				else
					return false;
				break;

			case '}':
				if (!stack.empty() && stack.peek() == '{')
					stack.pop();
				else
					return false;
				break;

			case ']':
				if (!stack.empty() && stack.peek() == '[')
					stack.pop();
				else
					return false;
				break;

			}

		}

		
		return stack.empty();

	}

}

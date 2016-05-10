import java.util.Stack;

public class Proj_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IntoPos("1+8+9*2"));
		System.out.println(IntoPos("7*5+(8+9*2)"));
	}

	public static String IntoPos(String Infix) {
		Stack<String> stack = new Stack<String>();
		String Postfix = "";
		for (int i = 0; i < Infix.length(); i++) {
			switch (Infix.charAt(i)) {

			case '0': {
				Postfix = Postfix.concat("0");

				break;
			}
			case '2': {
				Postfix = Postfix.concat("2");

				break;
			}
			case '3': {
				Postfix = Postfix.concat("3");

				break;
			}
			case '1': {
				Postfix = Postfix.concat("1");

				break;
			}
			case '4': {
				Postfix = Postfix.concat("4");

				break;
			}
			case '5': {
				Postfix = Postfix.concat("5");

				break;
			}
			case '6': {
				Postfix = Postfix.concat("6");

				break;
			}
			case '7': {
				Postfix = Postfix.concat("7");

				break;
			}
			case '8': {
				Postfix = Postfix.concat("8");

				break;
			}
			case '9': {
				Postfix = Postfix.concat("9");

				break;
			}
			case '(': {
				stack.push("(");
				break;
			}
			case '+': {
				if (!stack.isEmpty()) {
					if (stack.peek().equals("+")) {
						stack.pop();
						Postfix = Postfix.concat("+");
						stack.push("+");
					} else if (stack.peek().equals("-")) {
						stack.pop();
						Postfix = Postfix.concat("-");
						stack.push("+");
					} else if (stack.peek().equals("*")) {
						stack.pop();
						Postfix = Postfix.concat("*");
						stack.push("+");
					} else if (stack.peek().equals("(")) {
						stack.pop();
						Postfix = Postfix.concat(stack.peek());
					}

				} else {
					stack.push("+");
				}
				break;
			}
			case '-': {
				if (!stack.isEmpty()) {
					if (stack.peek().equals("+")) {
						stack.pop();
						Postfix = Postfix.concat("+");
						stack.push("-");
					} else if (stack.peek().equals("-")) {
						stack.pop();
						Postfix = Postfix.concat("-");
						stack.push("-");
					} else if (stack.peek().equals("*")) {
						stack.pop();
						Postfix = Postfix.concat("*");
						stack.push("-");
					}
				} else {
					stack.push("-");
				}
				break;
			}
			case '*': {
				if (!stack.isEmpty()) {
					if (stack.peek().equals("*")) {

						Postfix = Postfix.concat(stack.peek());
						stack.pop();
						stack.push("*");
					}
					if (stack.peek().equals("+")) {

						stack.push("*");
					}
					if (stack.peek().equals("-")) {

						stack.push("*");
					}

				} else {
					stack.push("*");
				}
				break;
			}
			case ')':
				if (!stack.isEmpty() && !("(").equals(stack.peek())) {

					Postfix = Postfix.concat(stack.peek());
					stack.pop();

				}

				break;
			}

		}

		while (!stack.isEmpty()) {
			Postfix = Postfix.concat(stack.peek());
			stack.pop();
		}
		return Postfix;
	}
}


import java.nio.charset.Charset;
import java.util.*;

public class TreeNode {
	public static enum Char1 {
		plus, minus, multiply, devide, number
	};

	public static char oper;
	public char value;
	public static TreeNode root;
	// public char ans;
	public TreeNode right, left;
	public static int level = 1, level_sub = level - 1;

	public TreeNode(char node) {

		// this.root = node;
		// if(node == '1' ||node == '2' ||node == '3' ||node == '4' ||node ==
		// '5' ||node == '6' ||node == '7' ||node == '8' ||node == '9' ||node ==
		// '0'){
		this.value = node;
		// }if (node == '+' ||node == '-' ||node == '*' ||node == '/' ){
		// this.oper = node;
		// }

		this.left = null;
		this.right = null;
	}

	public static void main(String[] args) {

		System.out.println(eval(makeExpressionTree("75*8+92*+")));
		printTree(makeExpressionTree("75*8+92*+"),0);
		// printPrefix(makeExpressionTree("75*8+92*+"));
		// System.out.println();
		// printPostfix(makeExpressionTree("75*8+92*+"));
		// System.out.println();
		// printInfix(makeExpressionTree("75*8+92*+"));
	}

	public static int eval(TreeNode root) {
		int result = 0;
		if (!(root == null)) {
			if ("+".equals(root.value)) {

				result += root.left.value + root.right.value;
			}
			if ("-".equals(root.value)) {
				result -= root.left.value - root.right.value;
			}
			if ("*".equals(root.value)) {
				result *= root.left.value * root.right.value;
			}
			if ("/".equals(root.value)) {
				result /= root.left.value / root.right.value;
			}
			eval(root.left);
			eval(root.right);
		}
		return result;
	}

	public static void printTree(TreeNode root, int level) {
		// String rootStr ;
		if (root != null) {
			printTree(root.right, level + 1);

			for (int i = 0; i < level; i++) {
				System.out.print("   ");

				// rootStr = root.toString();
			}
			System.out.println(root.value);
			System.out.println();

			printTree(root.left, level + 1);

		}
	}

	public static void printPrefix(TreeNode root) {

		if (root != null) {
			System.out.print(root.value);
			printPrefix(root.left);
			printPrefix(root.right);
		}

	}

	public static void printPostfix(TreeNode root) {
		if (root != null) {

			printPostfix(root.left);
			printPostfix(root.right);
			System.out.print(root.value);
		}
	}

	public static void printInfix(TreeNode root) {
		if (root != null) {
			printInfix(root.left);
			System.out.print(root.value);
			printInfix(root.right);
		}
	}

	public static TreeNode makeExpressionTree(String postfix) {

		TreeNode root = null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		for (int i = 0; i < postfix.length(); i++) {
			switch (postfix.charAt(i)) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': {
				root = new TreeNode(postfix.charAt(i));
				root.value = postfix.charAt(i);
				root.left = null;
				root.right = null;

				stack.push(root);

				break;
			}
			case '+':
			case '-':
			case '*':
			case '/': {

				root = new TreeNode(postfix.charAt(i));
				root.value = postfix.charAt(i);

				level++;

				TreeNode inNodeR = stack.peek();
				root.right = inNodeR;
				stack.pop();

				TreeNode inNodeL = stack.peek();
				root.left = inNodeL;
				stack.pop();
				stack.push(root);

				// System.out.println(root.value);
				// System.out.println(root.left.value +" "+ root.right.value);
				break;
			}

			}

		}

		return root;
	}

}
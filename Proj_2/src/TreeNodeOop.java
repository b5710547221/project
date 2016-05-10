import java.util.*;

public class TreeNodeOop extends Exp {
	private char value;
	private static int levelAll = 1;
	private TreeNodeOop right;
	private TreeNodeOop left;
	// private TreeNodeOop left, right;

	// private TreeNodeOop root;

	private static char data;
	private static PlusExp plus;
	private static MinusExp minus;
	private static multiExp multi;
	private static Divide divide;

	public TreeNodeOop(char values) {
		// this.root = new TreeNodeOop(values);
		// this.data = values;
		this.value = values;
		// this.left = new TreeNodeOop(values);
		// this.right= new TreeNodeOop(values);
	}

	public static void main(String[] args) {
		printTree(makeTreeExp("75*8+92*+"), levelAll);
		TreeNodeOop root = makeTreeExp("75*8+92*+");
		
		System.out.println(root.eval());
		// Exp root = makeTreeExp(//postfix);
		// printTree(root,0);
		// System.out.println(root.eval());
	}

	public static void printTree(TreeNodeOop root, int level) {
		// String rootStr ;
		if (root != null) {
			printTree(root.right, level + 1);

			for (int i = 0; i < level; i++) {
				System.out.print("   ");

				// rootStr = root.toString();
			}
			System.out.println(root.value + "  ");
			// System.out.println();

			printTree(root.left, level + 1);

		}

	}

	public static TreeNodeOop makeTreeExp(String postfix) {

		char x;
		TreeNodeOop root = null;

		Stack<TreeNodeOop> stack = new Stack<TreeNodeOop>();
		for (int i = 0; i < postfix.length(); i++) {
			switch (postfix.charAt(i)) {
			case '0':
			case '1':
			case '3':
			case '2':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9': {

				root = new TreeNodeOop(postfix.charAt(i));
				root.setValue(postfix.charAt(i));
				root.right = null;
				root.left = null;

				stack.push(root);

				break;
			}
			case '+': {
				root = new TreeNodeOop(postfix.charAt(i));

				root.setValue(postfix.charAt(i));

				if (stack.size() >= 2) {

					root.right = stack.peek();

					stack.pop();

					root.left = stack.peek();

					stack.pop();

					levelAll++;

				}

				stack.push(root);

				break;
			}
			case '-': {
				root = new TreeNodeOop(postfix.charAt(i));

				root.setValue(postfix.charAt(i));
				if (stack.size() >= 2) {

					root.right = stack.peek();

					stack.pop();

					root.left = stack.peek();

					stack.pop();

					levelAll++;

				}
				System.out.println(root);
				stack.push(root);

				break;
			}
			case '*': {
				root = new TreeNodeOop(postfix.charAt(i));

				root.setValue(postfix.charAt(i));
				if (stack.size() >= 2) {

					root.right = stack.peek();

					stack.pop();

					root.left = stack.peek();

					stack.pop();

					levelAll++;

				}
				stack.push(root);

				break;
			}
			case '/': {
				root = new TreeNodeOop(postfix.charAt(i));

				root.setValue(postfix.charAt(i));
				if (stack.size() >= 2) {

					root.right = stack.peek();

					stack.pop();

					root.left = stack.peek();

					stack.pop();

					levelAll++;
				}
				stack.push(root);
				break;
			}

			}

		}

		return root;
	}

	public  int eval() {
		// TODO Auto-generated method stub
         
		 TreeNodeOop root = makeTreeExp("75*8+92*+");;
	     
		if (root.value == '+') {
	
			
		    
		    return root.right.value + root.left.value;
		}
		if (root.value == '-') {
			
			
			return root.right.value - root.left.value;
		}
		if (root.value == '*') {
			
			return root.right.value * root.left.value;
		}
		if (root.value == '/') {
			
			return root.right.value / root.left.value;
		}
		return 0;
	}

	@Override
	public TreeNodeOop getLeft() {
		// TODO Auto-generated method stub
		return this.left;
	}

	@Override
	public TreeNodeOop getRight() {
		// TODO Auto-generated method stub
		return this.right;
	}

	@Override
	public void setLeft(TreeNodeOop left) {
		// TODO Auto-generated method stub
		this.left = left;
	}

	@Override
	public void setRight(TreeNodeOop right) {
		// TODO Auto-generated method stub
		this.right = right;
	}

	@Override
	public void setValue(char value) {
		// TODO Auto-generated method stub
		this.value = value;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return this.value + "";
	}

}
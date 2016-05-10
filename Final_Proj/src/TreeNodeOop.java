import java.util.Stack;

public class TreeNodeOop extends Exp {
	private  char value;
	private static int levelAll = 1;
	private Exp right;
	private Exp left;
    private String postfix ;

	// private TreeNodeOop root;

	public String getPostfix() {
		return postfix;
	}

	public void setPostfix(String postfix) {
		this.postfix = postfix;
	}

	private static char data;
	private static PlusExp plus;
	private static MinusExp minus;
	private static multiExp multi;
	private static divideExp divide;

	public TreeNodeOop(char values) {
		// this.root = new TreeNodeOop(values);
		// this.data = values;
		this.value = values;
		// this.left = new TreeNodeOop(values);
		// this.right= new TreeNodeOop(values);
	}
	
	public static void main(String[] args) {
		String postfix = "75*8+92*+";
		printTree(makeTreeExp("75*8+92*+"), levelAll);
		Exp root = makeTreeExp("75*8+92*+");
		
		System.out.println(root.eval());
		
		//Visitor v = new Evaluator();
		//System.out.println("Exp result is"+root.accept(v));
		
		
		// Exp root = makeTreeExp(//postfix);
		// printTree(root,0);
		// System.out.println(root.eval());
	}

	public static void printTree(Exp root, int level) {
		// String rootStr ;
		if (root != null) {
			printTree(root.getRight(), level + 1);

			for (int i = 0; i < level; i++) {
				System.out.print("   ");

				// rootStr = root.toString();
			}
			System.out.println(root.getValue() + "  ");
			// System.out.println();

			printTree(root.getLeft(), level + 1);

		}

	}

	public static Exp makeTreeExp(String postfix) {

		char x;
		Exp root = null;

		Stack<Exp> stack = new Stack<Exp>();
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
				root.setLeft(null);;
				root.setRight(null);;

				stack.push(root);

				break;
			}
			case '+': {
				root = new TreeNodeOop(postfix.charAt(i));

				root.setValue(postfix.charAt(i));

				if (stack.size() >= 2) {

					root.setRight(stack.peek());

					stack.pop();

					root.setLeft(stack.peek());

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

					root.setRight(stack.peek());

					stack.pop();

					root.setLeft(stack.peek());

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

					root.setRight(stack.peek());

					stack.pop();

					root.setLeft(stack.peek());

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

					root.setRight(stack.peek());

					stack.pop();

					root.setLeft(stack.peek());

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
         int ans= 0;
		Exp root = makeTreeExp("75*8+92*+");;
	     
		if (root.getValue()==("+")) {
	
			
		    
		    ans = Integer.parseInt(root.getRight().getValue()) + Integer.parseInt(root.getLeft().getValue());
		}
		else if (root.getValue()==("-"))  {
			
			
			ans = Integer.parseInt(root.getRight().getValue()) - Integer.parseInt(root.getLeft().getValue());
		}
		else if (root.getValue()==("*"))  {
			
			ans = Integer.parseInt(root.getRight().getValue()) * Integer.parseInt(root.getLeft().getValue());
		}
		else if (root.getValue()==("/"))  {
			
			ans = Integer.parseInt(root.getRight().getValue()) / Integer.parseInt(root.getLeft().getValue());
			}
		return ans;
	}

	@Override
	public Exp getLeft() {
		// TODO Auto-generated method stub
		return this.left;
	}

	@Override
	public Exp getRight() {
		// TODO Auto-generated method stub
		return this.right;
	}

	@Override
	public void setLeft(Exp left) {
		// TODO Auto-generated method stub
		this.left = left;
	}

	@Override
	public void setRight(Exp right) {
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

	@Override
	public Object accept(Visitor v) {
		// TODO Auto-generated method stub
		return  makeTreeExp(this.getPostfix());
	}

	@Override
	public Exp gateA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exp gateB() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
import java.util.Stack;

public class Main extends Evaluator {
	private PlusExp plus;
	private MinusExp minus;
	private multiExp multi;
	private divideExp divide;
	private Number num;
	private VarExp var;
	private static Exp root;
	private static Evaluator e;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String postfix = "75*8+92*+";
		Exp root1 = TreeNodeOop.makeTreeExp(postfix);
		Visitor v = new Evaluator();
        int sum = makeTreeExp2(postfix) ;
		System.out.println("result is " + sum);
	}

	public static Integer makeTreeExp2(String postfix) {
		
		
	     
		Integer sum = 0;
		Stack<Integer> stack = new Stack<Integer>();
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

				root.setValue(postfix.charAt(i));
				Number n = (Number) root;
				Integer ans = e.visit(n);
				stack.push(ans);

				break;
			}
			case '+': {

				root.setValue(postfix.charAt(i));
				PlusExp n = (PlusExp) root;
				sum += e.visit(n);
				stack.push(sum);

				break;
			}
			case '-': {

				root.setValue(postfix.charAt(i));
				MinusExp n = (MinusExp) root;
				sum += e.visit(n);
				stack.push(sum);

				break;
			}
			case '*': {

				root.setValue(postfix.charAt(i));
				multiExp n = (multiExp) root;
				sum += e.visit(n);
				stack.push(sum);

				break;
			}
			case '/': {

				root.setValue(postfix.charAt(i));
				divideExp n = (divideExp) root;
				sum += e.visit(n);
				stack.push(sum);

				break;

			    }
			}
		}

		return sum;
	}
}

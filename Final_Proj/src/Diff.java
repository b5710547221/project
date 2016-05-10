
public class Diff implements Visitor{
    
	@Override
	public Exp visit(PlusExp n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exp visit(MinusExp n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exp visit(multiExp n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exp visit(divideExp n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exp visit(Number n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exp visit(VarExp n) {
		// TODO Auto-generated method stub
		return null;
	}
	public Exp accept(Visitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}
    public static void main(String[] args){
    	Visitor v = new Diff();
    	String postfix = "75*8+92*+";
		Exp root1 = TreeNodeOop.makeTreeExp(postfix);
		Exp diffExp = (Exp) root1.accept(v);
    }
}

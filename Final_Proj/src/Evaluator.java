
public class Evaluator implements Visitor{

	@Override
	public  Integer visit(PlusExp n) {
		// TODO Auto-generated method stub
		//PlusExp t = n;
		return (Integer) n.getLeft().accept(this) + (Integer) n.getRight().accept(this);
	}

	@Override
	public  Integer visit(MinusExp n) {
		// TODO Auto-generated method stub
		return (Integer) n.getLeft().accept(this) - (Integer) n.getRight().accept(this);
	}

	@Override
	public  Integer visit(multiExp n) {
		// TODO Auto-generated method stub
		return (Integer) n.getLeft().accept(this) * (Integer) n.getRight().accept(this);
	}
	

	@Override
	public Integer visit(divideExp n) {
		// TODO Auto-generated method stub
		return (Integer) n.getLeft().accept(this) / (Integer) n.getRight().accept(this);
	}

	@Override
	public Integer visit(Number n) {
		// TODO Auto-generated method stub
		return (Integer) n.accept(this);
	}

	
	public String visit(VarExp n) {
		// TODO Auto-generated method stub
		return (String) n.accept(this);
	}

	
	
	

}

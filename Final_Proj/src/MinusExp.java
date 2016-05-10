
public class MinusExp extends Exp{
    private Exp left,right;
    private String datum;
    public MinusExp(Exp a1,Exp a2){
    	this.left = a1;
    	this.right = a2;
    	this.datum ="-";
    }
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return left.eval() - right.eval();
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
		this.datum = value+"";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return this.datum;
	}
	@Override
	public Object accept(Visitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}
	@Override
	public Exp gateA() {
		// TODO Auto-generated method stub
		return this.left;
	}
	@Override
	public Exp gateB() {
		// TODO Auto-generated method stub
		return this.right;
	}

}



public class VarExp extends Exp{
    
	
	private Exp x;
	public VarExp (Exp x){
		
		this.x =x;
	
	}
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Exp getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exp getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLeft(Exp left) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRight(Exp right) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValue(char value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object accept(Visitor v) {
		// TODO Auto-generated method stub
		return v.visit(this);
	}
	@Override
	public Exp gateA() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Exp gateB() {
		// TODO Auto-generated method stub
		return this.x;
	}

}

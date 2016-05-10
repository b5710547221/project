
public class Number extends Exp{
    
    private String datum;
    public Number(String data){
    	
    	this.datum = data;
    }
	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return Integer.parseInt(datum);
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
	public Object accept(Visitor v) {
		// TODO Auto-generated method stub
		return this.getValue();
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

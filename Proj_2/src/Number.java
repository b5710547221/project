

public class Number extends Exp{

	private String value;
	private Exp left,right;
	private String values;
	
	public Number(Exp x,Exp y,String values){
		this.left = null;
		this.right = null;
		this.value = "/";
        this.values = values;
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
	public void setLeft(TreeNodeOop  left) {
		// TODO Auto-generated method stub
		this.left = left;
	}

	@Override
	public void setRight(TreeNodeOop  right) {
		// TODO Auto-generated method stub
		this.right = right;
	}

	@Override
	public void setValue(char value) {
		// TODO Auto-generated method stub
		this.values = value +"";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return this.values +"";
	}


	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	


	

	
	
}
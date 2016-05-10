
//public class EvalVisitor {
//
//	public int visit(Exp e){
//		if(e instanceof PlusExp){
//			PlusExp t = (PlusExp) e;
//			return visit(t.getLeft())+visit(t.getRight());
//		}else if(e instanceof MinusExp){
//			PlusExp t = (PlusExp) e;
//			return visit(t.getLeft())-visit(t.getRight());
//		}else if(e instanceof Number){
//			Number t = (Number) e;
//			return Integer.parseInt(t.getValue());
//		}
//	}
//}
public interface Visitor{
	public Object visit(PlusExp n);
	public Object visit(MinusExp n);
	public Object visit(multiExp n);
	public Object visit(divideExp n);
	public Object visit(Number n);
	public Object visit(VarExp n);
}
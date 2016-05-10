
public abstract class Exp {
   public abstract int eval();
   public abstract Exp getLeft();
   public abstract Exp getRight();
   public abstract void setLeft(Exp left);
   public abstract void setRight(Exp right);
   public abstract void setValue(char value);
   public abstract String getValue();
   public abstract Object accept(Visitor v) ;
   public abstract Exp gateA();
   public abstract Exp gateB();
  

   
}


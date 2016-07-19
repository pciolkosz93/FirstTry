package test1;

public class B extends A{

	public B(int x,String str){
		super(x,str);
	}
	public B(){
		super();
	}
	public B clone(){
		return (B)super.clone();
	}
}

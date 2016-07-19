package test1;

public class C extends B{

	public C(int x,String str){
		super(x,str);
	}
	public C(){
		super();
	}
	public C clone(){
		return (C)super.clone();
	}
}

package test1;

public class A implements Cloneable{
	protected int x;
	protected String str;
	
	public A(int x, String str){
		this.x = x;
		this.str = str;
	}
	public A(){
		this.x = 0;
		this.str = null;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public String toString(){
		return Integer.toString(x) + " " + getStr();
	}
	public A clone(){
		try {
			return (A)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}

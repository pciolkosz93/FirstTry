package test1;

public class RegularClass extends FirstAbstractClass {

	public RegularClass(int x, String text){
		this.x = x;
		this.text = text;
	}
	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getX() {
		return x;
	}
	public String toString(){
		return x+" "+text;
	}

}

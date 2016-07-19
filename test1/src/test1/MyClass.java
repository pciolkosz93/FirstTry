package test1;

public class MyClass {
	int xValue;
	
	public MyClass(){
		this.xValue = 0;
	}
	public MyClass(int xValue){
		try{
		if(xValue < 0) throw new IllegalArgumentException("xValue < 0");
		}
		catch(IllegalArgumentException e){
			System.out.println("Invalid value");
			xValue = 0;
		}
		this.xValue = xValue;
	}
	@Override
	public String toString()
	{
		return Integer.toString(xValue);
	}
}

package test1;
//import java.util.*;
import java.lang.reflect.Constructor;
import java.util.*;
//import java.util.Map;
public class TestClass1 {
	public static void main(String args[])
	{
		/*String text = "myText";
		Integer myInteger = 23;
		myInteger = 25;
		MyClass myClass = MyClass.class.newInstance();
		System.out.println(text.endsWith("Xt".toLowerCase()));
		System.out.println(myInteger);
		System.out.println(myClass);
		System.out.println(text+1+" "+new MyClass(-5)+ " " + 3.14);*/
		
		
		
//		Object objClass;
//		int i;
//		System.out.println("---------------------------------------------------------");
//		try {
//			Class xClass = Class.forName("test1.A");
//			Constructor xConstructor = xClass.getConstructor(int.class,String.class);
//			objClass = xConstructor.newInstance(1,"x");
//			A aClass = (A)objClass;
//			A aClass2 = new A();
//			System.out.println(aClass);
//			System.out.println(aClass2);
//			i=8;
//			System.out.println(i);
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//		FirstAbstractClass rc = new RegularClass(69,"RegularClass");
//		System.out.println(rc);
//		A a = new A();
//
//		Class cl = a.getClass();
//		try {
//			Object a2 = cl.newInstance();
//			Object cl2 = C.class.getClass().newInstance();
//			System.out.println(a2);
//			A ax = new A();
//			B bx = new B();
//			C cx = new C();
//			if(bx instanceof A) System.out.println("true1");
//			if(cx instanceof A) System.out.println("true2");
//			if(ax instanceof B) System.out.println("true3");
//			if(bx instanceof C) System.out.println("true4");
//			if(cx instanceof B) System.out.println("true5");
//			if(ax instanceof C) System.out.println("true6");
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		C cl1 = new C(1,"x");
		C cl2 = new C(2,"xx");
		String str1 = "abcd";
		String str2 = "efgh";
		for(int i = 1; i <= 3; i++)
			str1 += i;
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println(cl1);
		System.out.println(cl2);
		String str3 = str1.toUpperCase().concat(str2);
		System.out.println("----------------------------------------------------------");
		cl2 = cl1;
		cl1.setX(120);
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println(cl1);
		System.out.println(cl2);
		str3 = str1.concat(str2).toUpperCase().concat(str2);
		System.out.println("----------------------------------------------------------");
		cl2.setX(320);
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println(cl1);
		System.out.println(cl2);
		str1 = str3;
		str3 += " xdd";
		if(cl1 instanceof Cloneable) System.out.println("TAK");
		cl1 = cl2.clone();
		cl2.setX(500);
		System.out.println("----------------------------------------------------------");
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println(cl1);
		System.out.println(cl2);
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(111, "xxx");
		map.put(11, "xx");
		map.put(1, "x");
		for(Map.Entry<Integer, String> entry: map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
//		if(true){
//			i = 5;
//		}
//		else{
//			i = 10;
//		}
//		System.out.println(i);
	
	}
}


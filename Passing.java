package java_basics;

public class Passing {
	
	public static void main (String args[]){
		
		myclass();
		myclass1(10, 20);
		//myclass2(name);
		String name = "john";
		System.out.println(name); 
		 
		int a = 100, b = 200, c = 300;
		int multi = (a+b+c)* 2;
		System.out.println(a+b+c);
		System.out.println(multi);
		
	}
  
	public static void myclass(){
	//	System.out.println("Hello");
	}
	
	public static void myclass1(int i, int j){
		System.out.println(i+j);
	}
	public static String myclass2(String name){
		return (name);
	}
	public static int myclass3(int a, int b, int c){
		return (a + b + c); 
	}
}

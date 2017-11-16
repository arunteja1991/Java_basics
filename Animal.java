package java_basics;

public class Animal{  

	 int add(int a,int b){
		 return a+b;}  
		  int add(int a,int b,int c){
		 return a+b+c;}  
		 }  
		 class TestOverloading1{  
		 public static void main(String[] args){ 
			 
			 Animal ad = new Animal();
			 System.out.println( ad.add(10,20));
			 ad.add(20, 30, 40);
		  
	//	 System.out.println(add(11,11,11));  
		 }}  

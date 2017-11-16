package java_basics;

public class objects {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		student bhargav = new student();// object 
	
		bhargav.setId(1);
		bhargav.setName("dkfhkdf");
		bhargav.setGrade('A');
		
		student arun = new student();// object 
		
		arun.setId(1);
		arun.setName("dkfhkdf");
		arun.setGrade('A');
		System.out.println("student names are : " + bhargav.getName() +"    "+ "and" +"     "+ arun.getName());
		//System.out.println("values getting: " );
	}

}

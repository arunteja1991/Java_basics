package java_basics;

public class java_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] value = new String[2];
		value[0]= "name";
		value[1]= "last";
		// String value = {"name","last"};
		int value1 = value.length;
		System.out.println("Length of the Array is ==> " + value1);
		
		for (int i=0;i<= value1-1; i++ ){
			System.out.println("values are:" +i);
		}
	}

}

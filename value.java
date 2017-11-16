package java_basics;

public class value {
	
	 int length;
	 int height;
	
	public int getvolume(){
		return (length * height );
	}
	

	value(){
		
	length = 10;
	height = 20;
	
	}
	value (int i, int j){
		length = i;
		height = j;
	}
}

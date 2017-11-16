package java_basics;

public class Array {
	
	public static void main(String args[]){
		
		int a[] = {10,44,585, 3};
		min(a);
	}
		static void min(int arr[]){
			int min = arr[0];
		for(int i=0; i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
				System.out.println(min);
			}
			
			
		}
		
	}}
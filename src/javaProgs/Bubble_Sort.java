package javaProgs;

public class Bubble_Sort {

	public static void main(String[] args) {
		int arr[] = {45, 99, 65, 87, 12 , 3 ,55};
		int len = arr.length;
		int temp =0;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<len; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

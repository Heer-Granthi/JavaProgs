package javaProgs;

import java.util.Arrays;

public class Binary_Search {

	public static void main(String[] args) {
		int arr[] = {23, 33, 45, 59, 65, 87, 99 };

		int flag = 0;
		int len = arr.length;
		int target = 45;
		int low = 0;
		int high = len-1;
		int loc = 0 ;
		
		
		
		while(low <= high) {
			int mid = (low + high)/2;
			if(target == arr[mid]) {
				flag = 1;
				loc = mid;
				break;
			}
			else if(target < arr[mid]) {
				high = mid-1;
			}
			else if(target > arr[mid]) {
				low = mid+1;
			}
		}
		if(flag == 1) {
			System.out.println(target+" is found at "+loc);
		}
		else {
			System.out.println(target+" is not found");
		}
		

	}

}

package javaProgs;
import java.util.*;
import java.util.Scanner;

public class Array_max_min {
		public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num[] = new int[10];
        
        System.out.println("enter the array size: ");
        int len = sc.nextInt();
        
        System.out.println("enter the array elements: ");
        for(int i=0; i<len; i++){
            num[i] = sc.nextInt();
        }
        
         System.out.println();
         
        int max = num[0];
        int min = num[0];
        for(int i=1; i<len; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("maximum element is: "+max);
        
        for(int i=1; i<len; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        System.out.print("minimum element is: "+min);
    }

}

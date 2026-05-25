package javaProgs;
import java.util.Scanner;

public class Array_insert {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num[] = new int[10];
        System.out.println("enter the array size: ");
        int len = sc.nextInt();
        System.out.println("enter the array elements: ");
        for(int i=0; i<len; i++){
            num[i] = sc.nextInt();
        }
        for(int i=0; i<len; i++){
             System.out.print(num[i]+" ");
         }
         System.out.println();
        System.out.println("enter the element to be inserted: ");
        int new_num = sc.nextInt();
        
        System.out.println("enter the index at which element is to be inserted: ");
        int ind = sc.nextInt();
        
        for(int i=len; i>ind; i--){
            num[i] = num[i-1];
        }
        num[ind] = new_num;
        
         for(int i=0; i<=len; i++){
             System.out.print(num[i]+" ");
         }
        
    }

}

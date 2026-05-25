package javaProgs;

public class Rev_3dig_num {
	public static void main(String[] args) {
        int num[] = {1,2,3};
        int len = num.length;
        for(int i=0; i<len; i++){
            System.out.print(num[i]);
        }
        System.out.println();
        int first = num[0];
        num[0] = num[len-1];
        num[len-1] = first;
        
        for(int i=0; i<len; i++){
            System.out.print(num[i]);
        }
        
    }

}

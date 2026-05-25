package javaProgs;

public class Recur_Pow {
	public static int power(int x, int y){
        if(x == 0 || y == 0){
            return 0;
        }
        else if(y == 0 ){
            return 1;
        }
        else if(x == 0 ){
            return 0;
        }
        return x * power(x,y-1);
    }
	public static void main(String[] args) {
        int ans = power(2,3);
        System.out.println("power is "+ans);
    }

}

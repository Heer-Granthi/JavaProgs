package javaProgs;

public class Recur_fib {
	public static int sum(int x){
        if(x == 0){
            return 0;
        }
        else if(x == 1){
            return 1;
        }
        return x + sum(x-1);
    }
    public static void main(String[] args) {
        int ans = sum(6);
        System.out.println("sum is "+ans);
    }

}

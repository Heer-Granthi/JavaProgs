package javaProgs;

public class Recur_Mul {
	public static int multiply(int x, int y){
        if(x == 0 || y == 0){
            return 0;
        }
        else if(x == 1 ){
            return y;
        }
        else if(y == 1 ){
            return x;
        }
        return x + multiply(x,y-1);
    }
	public static void main(String[] args) {
        int ans = multiply(5,2);
        System.out.println("multiplication is "+ans);
    }

}

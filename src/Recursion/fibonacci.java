package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n=4;
        System.out.println(series(n));
    }
    public static int series(int n){
        if(n<=1){
           return n;
            }

        return series(n-1)+series(n-2);

    }
}

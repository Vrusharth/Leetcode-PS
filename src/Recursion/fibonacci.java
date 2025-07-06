package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n=4;
        System.out.println(series(n));
    }
    public static int series(int n){
        while(n>=0){
            if(n==0 && n==1){
                return 1;
            }
        }
        return series(n-1)+series(n-2);
    }
}

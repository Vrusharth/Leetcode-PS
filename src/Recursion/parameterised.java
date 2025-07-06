package Recursion;

public class parameterised {
    public static void main(String[] args) {
        int N =4,sum=0;
//       f(N,sum);
       fact(N,1);
    }
    public static void f(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        System.out.println(i+" "+sum);
        f(i-1,sum+i);
        // 1st iteration: i=5, sum =5+0=5
        // 2nd iteration: i=4, sum =5+4=9
        // 3rd iteration: i=3, sum =9+3=12
        // 4th iteration: i=2, sum =12+2=14
        // 5th iteration: i=1, sum =14+1=15

    }

    public static void fact(int i, int m){
        if(i<1){
            System.out.println(m);
            return;
        }
        fact(i-1,m*i);
    }

}

package Recursion;

public class functional {
    public static int f(int n){
        if(n==0) {
            return 0;
        }
        System.out.println(n);
        return n + f(n-1); // function used to iterate over and add up
        // 1st iteration: 4 + f(3)
        // 2nd iteration: 4 + 3 + f(2)
        // 3rd iteration: 4 + 3 + 2 + f(1)
        // 4th iteration: 4 + 3 + 2 + 1 + f(0)-> returns 0;
        // 5th iteration: 4 + 3 + 2 + 1 + 0 = 10
    }

    public static void main(String[] args) {
        int N = 4;
        System.out.println(f(N));

    }
    public static int factorial(int n){
        if(n==0) {
            return 0;
        }
        return n*factorial(n-1);
    }

}

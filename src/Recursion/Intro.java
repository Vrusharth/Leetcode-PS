package Recursion;

public class Intro {
    public static int count =0;
    public static void Recursion(){
        while (count<5) {
            System.out.println(count++);

            Recursion();

        }
    }

    public static void main(String[] args) {
        // Recursion();
        int N=5,sum=0;
        Sum(N,sum);
    }
    public static void Sum(int N,int sum){
        if(N<1){
            System.out.println(sum);
            return;
        }
        System.out.println(N+" "+sum);
        Sum(N-1,sum+N);
    }
}

package com.recursion;

class OneToN{

}

public class Backtracking {
    public static void main(String[] args) {
        int n=3;
        int sum=0;

        funct(n,n);
        SumOF(n,sum);
    }
    // conventional method uses Funct(i+1,n)
    private static void funct(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        funct(i+1,n);
    }
    //Backtracking

    //Sum of  n numbers

    private  static void SumOF(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        SumOF(i-1,sum+i);
    }


}

package com.recursion;

import java.util.Scanner;

public class getStarted {
    public static void main(String[] args) {
        // write a function that \
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of times to repeat a name");
        int n=sc.nextInt();
        msg(i,n);
    }
    static void msg(int i,int n){
        if(i==n){
            return;
        }
        System.out.println("Hello");
        msg(i+1,n);


        }

}

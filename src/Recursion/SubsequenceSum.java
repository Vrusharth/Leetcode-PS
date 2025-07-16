package Recursion;

// here finding a subsequence with sum = 2

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSum {
    public static void main(String[] args) {
        int[] arr ={1,2,1};
        int n=3;
        List<Integer> Ds =new ArrayList<>();
        int sum=0;
        Find(0,Ds,sum,arr,n);
    }
    public static void Find(int i,List<Integer> Ds, int sum, int[] arr, int n){
        if(i==n){
            if(sum==2){
                System.out.println(Ds);
            }
            return;
        }
        Ds.add(arr[i]);
        sum=sum+arr[i];
        Find(i+1,Ds,sum,arr,n);
        Ds.remove(Ds.size()-1);
        sum=sum-arr[i];
        Find(i+1,Ds,sum,arr,n);
    }
}

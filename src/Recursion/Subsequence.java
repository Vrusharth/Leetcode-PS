package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int [] arr ={3,2,1};
        List<Integer> L=new ArrayList<>();
        FindSubsequence(0,arr,L);
    }
    public static void FindSubsequence(int idx, int [] arr, List<Integer> L){
        if(idx==arr.length){
            System.out.println(L);
            return;
        }

        // include the current element
        L.add(arr[idx]);
        FindSubsequence(idx+1,arr,L);

        // Backtrack and don't include the current element 
        L.removeLast();
        FindSubsequence(idx+1,arr,L);
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr ={1,1,1,2,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> l = new ArrayList<>();

        F(0,4,l,arr);
    }
    public static void F(int indx,int target, List<Integer> l,int[] arr){
        if(indx == arr.length){
            if(target == 0){
                System.out.println(l);
            }
            return;
        }
        if(arr[indx] <= target) {
            l.add(arr[indx]);
            F(indx + 1, target - arr[indx], l, arr);
            l.removeLast();
            target= target + arr[indx];
        }
        F(indx+1,target,l,arr);

    }
}

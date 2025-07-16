package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr ={2,3,5,6,7,8};
        List<Integer> L = new ArrayList<>();
        int target = 7;
        int indx=0;
        f(arr,indx,target,L);
    }
    public static void f(int[] arr, int indx, int target, List<Integer> L ){
        if(indx==arr.length){
            if(target==0){
                System.out.println(L);
            }
            return;
        }
        if(arr[indx]<=target){
            L.add(arr[indx]);

            f(arr,indx,target-arr[indx],L);
            L.removeLast();

        }
        f(arr,indx+1,target,L);
    }
}

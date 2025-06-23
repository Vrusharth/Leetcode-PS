package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class MinInRotatedArray {
    static int FindMin(int [] arr ,int n){
        int low =0,high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            // if left part is sorted
            if(arr[low]<=arr[high]) {
                min=Math.min(min,arr[low]);
                break;
            }
            // if left part is sorted

            if (arr[low] <= arr[mid]){
                min = Math.min(min, arr[low]);
                low=mid+1;
            }
            else{ // if right part is sorted

                // keep the  minimum
                min = Math.min(min,arr[mid]);
                // eliminate right half
                high =mid-1;

            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr ={7,8,9,1,2,3,4,5,6};
        int n=9;
        int ans = FindMin(arr,n);
        System.out.println(ans);
    }
}

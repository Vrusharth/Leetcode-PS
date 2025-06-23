package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchinRotatedArray {
    static int find(ArrayList<Integer> arr, int n,int k){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)==k){
                return mid;
            }
            // if left part is sorted
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=k && k<=arr.get(mid)){
                    // move to left part for checking
                    high =mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                // if right part is sorted
                if(arr.get(mid)<k && k<arr.get(high)){
                    low = mid+1;

                }else{
                    high =mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ar =new ArrayList<>(Arrays.asList(7,8,9,1,2,3,4,5,6));
        int n = 9,k=1;
        int ans = find(ar,n,k);
        if(ans==-1){
            System.out.println("Not present");

        }else{
            System.out.println(ans);
        }
    }
}


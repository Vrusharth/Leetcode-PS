package BinarySearch;

import java.util.ArrayList;

public class SearchinRotatedArray {
    static int find(ArrayList<Integer> arr, int n,int k){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)==k){
                return mid;
            }
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=k && k<=arr.get(mid)){
                    // move to left part for checking
                    high =mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
    }
}


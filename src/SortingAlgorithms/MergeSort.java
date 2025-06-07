package SortingAlgorithms;

import java.util.ArrayList;

public class MergeSort {
    public MergeSort(int [] arr, int low, int high, int mid){
        if(low==high) return;
        ArrayList<Integer> temp =new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid || right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        // if elements on left are still left
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        // if elements on right are still left
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

    }
    public static void main(String[] args) {

    }
}

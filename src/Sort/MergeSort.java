package Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void Divide(int[]arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        Divide(arr,l,mid);
        Divide(arr,mid+1,r);
        Conquer(arr,l,mid,r);
    }
    public static void Conquer(int[] arr, int l, int mid, int r) {
        int lIdx = l;
        int rIdx = mid + 1;
        int x = 0;
        int[] Merged = new int[r - l + 1];

        while (lIdx <= mid && rIdx <= r) {
            if (arr[lIdx] < arr[rIdx]) {
                Merged[x++] = arr[lIdx++];
            } else {
                Merged[x++] = arr[rIdx++];
            }
        }

        while (lIdx <= mid) {
            Merged[x++] = arr[lIdx++];
        }

        while (rIdx <= r) {
            Merged[x++] = arr[rIdx++];
        }

        for (int i = 0, j = l; i < Merged.length; i++, j++) {
            arr[j] = Merged[i];
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,4,5,1,4,9,8,6,7,12,10};
        int n =arr.length;
        Divide(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

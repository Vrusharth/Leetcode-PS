package Arrays.solve;

import java.util.Scanner;

public class CheckSorted {
    static void isSorted(int[] arr, int n){
        boolean isAscending=false;
        boolean isDescending=false;

        for(int i=1;i<n;i++){
            if(arr[i]<=arr[i-1]){
                isAscending=true;
            }
            if(arr[i-1]>=arr[i]){
                isDescending=true;
            }

        }
        if(isAscending){
            System.out.print("Array is sorted Ascending wise");
        } else if (isDescending) {
            System.out.print("Array is sorted Descending wise");
        }else{
            System.out.print("Array is  unsorted");
        }

    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,6};
        int n=6;
        isSorted(arr,n);
    }
}

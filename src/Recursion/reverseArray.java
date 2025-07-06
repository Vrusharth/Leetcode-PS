package Recursion;

import java.util.Arrays;

public class reverseArray {
    public static void reverse(int[] arr, int l, int h){
        if(l==h) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp =arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
        reverse(arr,l+1,h-1);
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int l=0;
        int h=4;
        reverse(arr, l, h);
    }
}

package Arrays.solve;

import java.util.Arrays;

public class leftrotatearray {
    public static void rotate(int[]arr,int n){
        int temp=arr[0];
        for(int i =0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int n=arr1.length;
        rotate(arr1,n);
    }
}

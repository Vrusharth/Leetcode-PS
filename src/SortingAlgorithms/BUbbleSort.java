package SortingAlgorithms;

public class BUbbleSort {
    public static void Bubblesort(int[] arr){
        int n =arr.length;
        for(int i =0;i<n-1;i++){
            boolean Swapped=false;
            for(int j =0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    Swapped=true;
                }
            }
            if(!Swapped) {
                System.out.println("Already sorted array");
             break;
            } // Already sorted array
        }
    }
    public static void main(String[] args) {
        int[] arr={43,67,34,12,67,90,43,2,1,22};
        int[] arr1={1,2,3,4,5,6,7,8};
        Bubblesort(arr);
        Bubblesort(arr1);
        for(int num:arr) System.out.print(num+" ");
        for(int nums : arr1) System.out.print(nums+" ");
    }
}

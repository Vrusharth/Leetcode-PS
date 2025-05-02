package SortingAlgorithms;

public class Insertion_Sort {
    public static void Sort(int[]arr,int n){
        for(int i =0;i<n-1;i++){
            int j=i;
            while(j>0 || arr[j-1]>arr[j]){
                int temp=0;
                arr[i-1]=temp;
                arr[i-1]=arr[i];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={6,4,3,2,7,8};
        Sort(arr1,6);
        for(int i:arr1) System.out.print(i+ " ");
    }
}

package Sort;

public class InsertionSort {
    public static void sort(int[]arr){
        int n=arr.length;
        int i,j;
        for(i=1;i<n;i++){
            j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp =arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr1={4,1,5,2,3};
        sort(arr1);
        for(int element:arr1) System.out.print(" "+ element);
    }
}

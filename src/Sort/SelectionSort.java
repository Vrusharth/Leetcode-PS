package Sort;

public class SelectionSort {
    public static void Sort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int minIdx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    int temp = arr[minIdx];
                    arr[minIdx]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1={4,3,2,5,1};
        Sort(arr1,arr1.length);
        for(int element:arr1) System.out.print(" "+ element);
    }
}

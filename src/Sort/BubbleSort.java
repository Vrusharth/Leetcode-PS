package Sort;

public class BubbleSort {
    public static void Sort(int [] arr){
        int n=arr.length, temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr={43,67,34,12,67,90,43,2,1,22};
        Sort(arr);
        for(int i:arr) System.out.print(i+" ");
    }
}

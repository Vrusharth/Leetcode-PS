package SortingAlgorithms;

public class SelectionSort {

    public static boolean Sorted(int[] arr, int n){
        int temp = 0;
        boolean Swapped=false;
        for(int i=0;i<n-2 ;i++){ //get first element
            int mini =i;
            for(int j=i;j<n-1;j++){ //traverse throughout to find smaller
                if(arr[j]<arr[mini]){
                    temp=arr[j];
                    arr[j]=arr[mini];
                    arr[mini]=temp;
                    Swapped=true;
                    System.out.println("Sorted"+temp);
                }
            }
            if(!Swapped){
                System.out.println("Array is sorted Already");
            }
        }

        return Swapped;
    }
    public static void main(String[] arr){
        int[] arr1={123,56,43,32,13,2};
        Sorted(arr1,arr1.length);
        for(int element:arr1) System.out.print(" "+ element);



    }

}

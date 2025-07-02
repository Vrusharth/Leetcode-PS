package Sort;

public class MergeSort {
    public static void Divide(int[]arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;
        Divide(arr,l,mid);
        Divide(arr,mid+1,r);

    }
    static void Conquer(int[] arr,int l,int mid,int r){

    }
}

package BinarySearch;

public class arrrayRotatedtimes {
    static int Count(int[] arr){
        int low=0,high=arr.length-1;
        int ans =Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    index=low;
                    ans=arr[low];
                }break;
            }


        }
        return -1;
    }
}

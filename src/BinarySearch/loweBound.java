package BinarySearch;

public class loweBound {
    public static void main(String[] args) {
        int[] arr={2, 4, 6, 8, 10};
        int t=6;
        int ans=findLowerBound(arr,t);
        System.out.println(ans);
    }
    public static int findLowerBound(int[] arr,int t){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid = (low+high)/2;

            if(arr[mid]< t) {
                //move to left
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}

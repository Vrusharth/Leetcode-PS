package BinarySearch;

public class BinarySearch {
    static int LastOccur(int[] arr,int target){
        int n=arr.length;
        int low=0,high=n-1;
        int result = -1;
        while (low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target){
                result = mid;
                low=mid+1;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,5,6,6,6,6,6,7,8};
        int target=6;
        int answer = LastOccur(arr,target);
        System.out.println(answer);
    }
}

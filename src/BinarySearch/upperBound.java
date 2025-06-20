package BinarySearch;

public class upperBound {
    public static int SearchUpper(int [] arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){

            int mid = (low+high)/2;
            if(arr[mid] > target) {
                ans=mid;
                // go to le
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=3;
        int result= SearchUpper(arr,target);
        System.out.println(result);


    }
}

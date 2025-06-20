package BinarySearch;

public class FloorCeil {
    static int findCeil(int[] arr,int x){
//        Find smallest number greater than equal to x
        int n=arr.length;
        int low =0,high=n-1;
        int ans =-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return arr[mid];
            else if (arr[mid]<x) {
                low =mid+1;
            }else {
                ans=arr[mid];
                high=mid-1;
            }
        }return ans;

    }
    static int findFloor(int[]arr,int x){
        int n=arr.length;
        int low=0,high=n-1;
        int ans =-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return arr[mid];
            else if (arr[mid] < x){
                ans=arr[mid];
                // move to right
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    return ans;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,4,5,6};
        int x=3;
        int resultC = findCeil(arr,x);
        int resultF= findFloor(arr,x);
        System.out.println(resultF +" "+ resultC);
    }
}

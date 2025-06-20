package BinarySearch;

public class CountOccurance {
    static int Firstoccured(int[] arr,int target){
            int n=arr.length;
            int low=0,high=n-1;
            int OccuredF = -1;
            while (low<=high){
                int mid =(low+high)/2;
                if(arr[mid]==target){
                    OccuredF=mid;
                    // find in left for first occurrence
                    high=mid-1;
                } else if (arr[mid]<target) {
                    low=mid+1; // move right
                }else{
                    high=mid-1; // move left
                }
            }
            return OccuredF;
        }
    static int lastOccured(int[] arr,int target){
        int n=arr.length;
        int low=0,high=n-1;
        int OccuredL = -1;
        while (low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target){
                OccuredL=mid;
                // find in right for last occurrence
                low=mid+1;
            } else if (arr[mid]<target) {
                low=mid+1; // move right
            }else{
                high=mid-1; // move left
            }
        }
        return OccuredL;
    }

        public static void main(String[] args) {
            int [] arr ={1,2,3,4,5,5,6,6,6,6,6,7,8};
            int target=6;
            int ans1 = lastOccured(arr,target);
            int ans2= Firstoccured(arr,target);
            System.out.println(ans2-ans1);
        }
    }



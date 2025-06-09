package Arrays.solve;

public class SecondLargeSmall {
    public static int second_Small(int[] arr, int n){
        if(n<2){
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]<small){
                second_small=small;
                small=arr[i];

            } else if (arr[i]<second_small && arr[i] !=small) {
                second_small=arr[i];
            }

        }
        return second_small;
    }
    public static int second_Large(int[] arr,int n){
        if(n<2){
            return -1;
        }
        int large =Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;
        int i;
        for (i=0;i<n;i++){
            if(arr[i]>large){
                second_large=large;
                large=arr[i];

            } else if (arr[i]>second_large && arr[i]!=large) {
                second_large=arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {
        int[] arr1={2,3,4,5,67,1,87,56,34,21,34,1};
        int n =arr1.length;
        System.out.println(second_Large(arr1,n));
        System.out.println(second_Small(arr1,n));
    }
}

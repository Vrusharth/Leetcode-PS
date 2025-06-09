package Arrays.solve;

public class rotateArrayByK {
    //reverse the array
    public static void reverse_Array(int[] a,int start, int end){
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start ++;
            end--;
        }
    }
    //rotate k elements to right
    public static void rotate(int[]a , int n,int k){
        // to reverse  first n-k
        reverse_Array(a,0,n-k-1);
        // to reverse k last one part/2nd part
        reverse_Array(a,n-k,n-1);
        // to reverse whole array
        reverse_Array(a,0,n-1);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        rotate(arr,n,k);
        for(int nums:arr) System.out.print(nums+ " ");
    }
}

package Arrays.solve;
// RemoveDuplicate using 2 pointers
public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr1={1,1,1,2,2,2,3,3,3,4,4,4,5,5,6};
        int n = arr1.length;
        int k=remove(arr1,n);
        for(int i=0;i<k;i++){
            System.out.print(arr1[i]+" ");
        }

    }
    static int remove(int[] arr,int n){
        int i=0;
        for(int j=1; j<n; j++){
            if(arr[i]!=arr[j]){
                i++;//here first i increases & becomes equal to j
                arr[i] = arr[j];// replace
            }
        }
        return i+1;
    }
}

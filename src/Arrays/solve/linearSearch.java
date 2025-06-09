package Arrays.solve;

public class linearSearch {
    public static void check(int[] arr, int n,int num){
        for(int i =0; i<n;i++){
            if(arr[i]==num){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        int [] arr={4,5,3,2,6,8,9,7,6,43,34,100};
        int n=arr.length;
        int num=7;
        check(arr,n,num);

    }
}

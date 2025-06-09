package Arrays.solve;

public class CountMax1 {
    public static int max(int[] arr){
        int count=0;
        int max=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                count += 1;
            }
            else{
                count=0;
            }
            max= Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1,1,1,3,1,1,1,1,5,1,1,1,1,1,1};

        System.out.println(max(arr));
    }
}

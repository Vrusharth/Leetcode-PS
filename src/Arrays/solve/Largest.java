package Arrays.solve;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " +n + " elements in the array");


        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int j=0;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("The largest Element is "+ max);

    }
}

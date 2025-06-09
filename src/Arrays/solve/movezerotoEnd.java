package Arrays.solve;

import java.util.ArrayList;
import java.util.Arrays;

public class movezerotoEnd {
    public static int[] move(int[] a){
//        ArrayList<Integer> temp=new ArrayList<>();
//        // first copy all the non zeros to temp arr
//        int n=a.length;
//        for (int j : a) {
//            if (j != 0) {
//                temp.add(j);
//            }
//        }
//        for(int i=0;i<n;i++){
//            a[i]=temp.get(i);
//        }
//        int nz=temp.size();
//        for(int i=nz;i<n;i++){
//            a[i]=0;
//        }
//        for(int num: a) System.out.println(num + " ");
        int j=-1;
        int n=a.length;
        for(int i =0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        // if value of j pointer is unchanged then return the array as no 0 present
        if(j==-1) return a;

        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                //swap a[i} and a[j]
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

                j++;

            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] arr ={1,0,3,0,4,0,5,0,6};
        System.out.println(Arrays.toString(move(arr)));
    }
}

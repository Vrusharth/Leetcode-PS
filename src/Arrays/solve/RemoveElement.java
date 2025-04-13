package Arrays.solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,3,2,3,4,5));

        for(int elements:arr){
            if(arr.contains(3)){
                arr.remove(elements);
            }

        }
        System.out.println(arr);



    }
}

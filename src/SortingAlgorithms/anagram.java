package SortingAlgorithms;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1=sc.nextLine();
        System.out.println("Enter the Second String");
        String str2=sc.nextLine();
        checkA(str1,str2);

        

    }
    public static boolean checkA(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        String st1=str1.replaceAll(" ","").toLowerCase();
        String st2=str1.replaceAll(" ","").toLowerCase();

//        ArrayList<Character> arr1=new ArrayList<>();
//        ArrayList<Character> arr2=new ArrayList<>();

        char[] arr1 = st1.toCharArray();
        char[] arr2 = st1.toCharArray();

        Arrays.sort(arr1);
        for(Character elements:arr1){

        }
        Arrays.sort(arr2);

        return !Arrays.equals(arr1,arr2) ;

    }
}

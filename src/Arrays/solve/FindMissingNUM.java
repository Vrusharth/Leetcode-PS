package Arrays.solve;

public class FindMissingNUM {
    public static void main(String[] args) {
        int [] a={1,2,3,5};
//        int n= 5;
        System.out.println(addNumber(a));
    }
    static int addNumber(int[] a){
        int n=a.length;
        int s1 = (n*(n+1))/2; // sum of first n natural numbers
        int s2=0;
        for (int j : a) { // sum of elements in the array  given
            s2 = s2 + j;
        }
        return s1-s2;
    }

}

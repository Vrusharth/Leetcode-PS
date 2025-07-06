package Recursion;

public class Pallindrom {
    public static void main(String[] args) {
        String str1="Nitin";
        if(!isPallinder(str1,0, str1.length()-1)){
            System.out.println("Not a Pallindrome");
        }
        else{
            System.out.println(str1+" Is a pallindrome");
        }

    }
    public static boolean isPallinder(String str, int l, int r ){
        str=str.toLowerCase();
        if(l>=r){
            return true;
        }
        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }
        return isPallinder(str,l+1,r-1);
    }
}

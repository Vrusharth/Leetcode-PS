package Strings;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String s ="I am a great person ";
        Stack<String> st = new Stack<String>();
        int i;
        String str="";
        // adding elements to the stack
        for(i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                st.push(str);
                str="";
            }
            else{
                str+=s.charAt(i);
            }
        }
        // poping out the elements from the stack
        String ans ="";
        while (st.size()!=1){
            ans += st.peek() + " ";
            st.pop();
        }
        ans+=st.peek();
        System.out.println("After reversing the string");
        System.out.println(ans);

    }

}

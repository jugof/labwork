import java.util.Scanner;
import java.util.Stack;

import stack.CharStack;

/**
 * reverseWord
 */
public class reverseWord {

    public static String reverse(String str) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length(); ++i){
            st.push(str.charAt(i));
        }
        String ansString = "";
        while(!st.isEmpty()){
            ansString += st.pop();
        }
        return ansString;
    }

    public static String reverse2(String str) {
        CharStack st = new CharStack(str.length());
        for(int i=0;i<str.length(); ++i){
            st.push(str.charAt(i));
        }
        String ansString = "";
        while(!st.is_empty()){
            ansString += st.pop();
        }
        return ansString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = in.nextLine();
        String ans = reverse2(str);
        System.out.println("Reversed string: " + ans);
    }
}
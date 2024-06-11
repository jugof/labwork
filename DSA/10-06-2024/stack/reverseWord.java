package stack;

import java.util.Scanner;
import java.util.Stack;

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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = "Juned";
        String ans = reverse(str);
        System.out.println("Reversed string: " + ans);
    }
}
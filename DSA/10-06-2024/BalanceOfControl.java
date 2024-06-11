import java.util.Scanner;

import stack.CharStack;

public class BalanceOfControl {

    public static boolean checkBalanceOfControl(String s){
        CharStack st = new CharStack(s.length());

        for(int i=0; i<s.length(); ++i) {
            char ch = s.charAt(i);
            if(st.is_empty()){
                st.push(ch);
            }
            else{
                char top = st.top();
                if(top == '{' && ch == '}')
                    st.pop();
                else
                    st.push(ch);
            }
        }
        return st.is_empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Parenthesis consisting of {} characters:");
        String parenthesis = in.nextLine();

        boolean ansCheck = checkBalanceOfControl(parenthesis);
        if(ansCheck)
            System.out.println("Balanced");
        else
            System.out.println("Error:unexpected");
        
    }
}

package stack;

import java.util.Stack;

public class MaxStack
    {
    static void global_push(Stack s,Stack ms,int e)
    {
        s.push(e);//push it on normal stack 
        if(ms.is_empty()==true || e>ms.peek())//see peek of max_stack if empty or if e is greater , then push to Max_stack 
            ms.push(e);
    }


    public static void main(String args [])
    {
        Stack normal=new Stack();
        Stack Max_stack=new Stack();
        normal.create_stack(10);
        Max_stack.create_stack(10);
        global_push(normal,Max_stack,10);


    }
}
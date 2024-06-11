package stack;

public class CharStack {
    int tos;
    int maxsize;
    char stack[];

    public CharStack() {}

    public CharStack(int size){
        maxsize = size;
        tos = -1;
        stack = new char[maxsize];
    }

    public void push(char ch) {
        stack[++tos] = ch;
    }

    public char pop(){
        return stack[tos--];
    }

    public char top(){
        return stack[tos];
    }

    public boolean is_empty(){
        return tos == -1;
    }
    
}

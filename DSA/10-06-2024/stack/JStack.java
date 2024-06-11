package stack;

public class JStack {

   int tos;
   int maxsize;
   int stack[];
    
   public void create_stack(int size){
        maxsize = size; 
        stack = new int[maxsize];
        tos = -1;
   }

   public void push(int element){
        tos++;
        stack[tos] = element;     
    }

    public boolean is_full(){
        if(tos == maxsize - 1)
            return true;
        else
            return false;
    }

    public int pop(){
        if(tos == -1)
            return -1;
        else
            return stack[tos--];    
    }

    public boolean is_empty(){
        if(tos == -1)
            return true;
        else
            return false;
    }

    public void print_stack() {
        for(int i = tos; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }
}
package LLstack;

/**
 * StackWll
 */
public class StackWll {

    Node tos;

    public void push(int element) {
        Node newNode = new Node(element);
        if(tos == null) {
            tos = newNode;
        }
        else{
            newNode.next = tos;
            tos = newNode;
        }
    }

    public void pop(){
        if(tos == null) {
            System.out.println("Stack is empty");
        }
        else{
            tos = tos.next;
        }
    }

    public void print_stack(){
        Node temp = tos;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int top() {
        if(tos == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return tos.data; 
    }
}
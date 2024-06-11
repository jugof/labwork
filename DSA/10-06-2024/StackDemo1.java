
import stack.*;
public class StackDemo1 {
    public static void main(String[] args) {
        JStack st = new JStack();
        st.create_stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.print_stack();
        System.out.println("Stack is Empty or not ");
        System.out.println("Poped element is: " + st.pop());

    }
}

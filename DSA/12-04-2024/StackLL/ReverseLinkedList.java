import LLstack.Node;
import LLstack.StackWll;

public class ReverseLinkedList {

    public static Node reverse(Node root) {
        Node temp = root;
        StackWll st = new StackWll();
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        while (!st.empty()) {
            Node newNode = new Node(st.top());
            st.pop();
            Node tail = root;
            root = newNode;
        }
        return root;
    }

    public static void print_list(Node root){
        Node temp = root;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
            
        Node f = new Node(10);
        Node s = new Node(5);
        Node t = new Node(15);
        Node root = f;
        f.next = s;
        s.next = t;
        root = reverse(root);
        print_list(root);    
    }
}

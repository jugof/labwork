package doubly;

public class CircularDoublyLL {
    Node root;
    Node tail;

    public void insert_left(int element) {
        Node newNode = new Node(element);
        if(root == null) {
            root = newNode;
            tail = newNode;
        }
        else{
            newNode.right = root;
            root.left = newNode;
            root = newNode;
            tail.right = root;
        }
    }

    public void insert_right(int element) {
        Node newNode = new Node(element);
        if(root == null) {
            root = newNode;
            tail = newNode;
        }
        else{
            newNode.left = tail;
            tail.right = newNode;
            tail = newNode;
            tail.right = root;
            root.left = tail;
        }
    }

    public void delete_left(){
        if(root == null) {
            System.out.println("List is empty");
        }
        else{
            Node temp = root;
            root = root.right;
            root.left = tail;
            temp.right = null;
            tail.right = root;
        }
    }

    public void delete_right(){
        if(root == null) {
            System.out.println("List is empty");
        }
        else if(root.right == null && root.left == null) {
            root = null;
        }
        else{
            Node temp = tail.left;
            temp.right = root;
            root.left = temp;
            tail.left = null;
            tail.right = null;
            tail = temp;
        }
    }

    public void print_normal(){
        Node temp = root;
        do {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }while(temp != root);
        System.out.println();
    }

    public void print_reverse(){
        Node temp = tail;
        do {
            System.out.print(temp.data + " ");
            temp = temp.left;
        } while(temp != tail);
    }
}
  
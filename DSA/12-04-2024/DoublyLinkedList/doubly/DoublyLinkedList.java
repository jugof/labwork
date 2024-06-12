package doubly;

public class DoublyLinkedList {
    Node root;

    public void insert_left(int element) {
        Node newNode = new Node(element);
        if(root == null) {
            root = newNode;
        }
        else{
            newNode.right = root;
            root.left = newNode;
            root = newNode;
        }
    }

    public void insert_right(int element) {
        Node newNode = new Node(element);
        if(root == null) {
            root = newNode;
        }
        else{
            Node temp = root;
            while(temp.right != null) {
                temp = temp.right;
            }
            temp.right = newNode;
            newNode.left = temp;
        }
    }

    public void delete_left(){
        if(root == null) {
            System.out.println("List is empty");
        }
        else{
            root = root.right;
            root.left = null;
        }
    }

    public void delete_right(){
        if(root == null) {
            System.out.println("List is empty");
        }
        else if(root.right == null) {
            root = null;
        }
        else{
            Node temp = root;
            Node leftTemp = temp;
            while(temp.right != null) {
                leftTemp = temp;
                temp = temp.right;
            }
            leftTemp.right = null;
            temp.left = null;
        }
    }

    public void print_normal(){
        Node temp = root;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
        System.out.println();
    }

    public void print_reverse(){
        Node temp = root;
        Node prev = root;
        while(temp != null) {
            prev = temp;
            temp = temp.right;
        }
        while(prev != null){
            System.out.print(prev.data + " ");
            prev = prev.left;
        }
    }
}
  
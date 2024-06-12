package list;

/**
 * LinkedList
 */
public class LinkedList {

    Node root;

    public LinkedList() {}


    public void insert_left(int element) {
        Node newNode = new Node(element);
        if(root == null) {
            root = newNode;
        }
        else{
            newNode.next = root;
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
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete_left(){
        if(root == null) {
            System.out.println("List is empty");
        }
        else{
            root = root.next;
        }
    }

    public void delete_right(){
        if(root == null) {
            System.out.println("List is empty");
        }
        else if(root.next == null) {
            root = null;
        }
        else{
            Node temp = root;
            Node leftTemp = temp;
            while(temp.next != null) {
                leftTemp = temp;
                temp = temp.next;
            }
            leftTemp.next = null;
        }
    }

    public void search(int key) {
        Node temp = root;
        while(temp != null) {
            if(temp.data == key) {
                break;
            }
            temp = temp.next;
        }
        if(temp == null) {
            System.out.println(key + " Element not found");
        }
        else {
            System.out.println(key + " Key Element found");
        }
    }

    public void print_list(){
        Node temp = root;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void delete(int key){
        if(root == null) {
            System.out.println("List is empty");
        }
        else if(root.next == null){
            if(root.data == key) {
                root = null;
            }
            else {
                System.out.println("Element not found");
            }
        }
        else {
            Node temp = root;
            Node prev = null;
            while(temp != null) {
                if(temp.data == key) {
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            if(temp == null) {
                System.out.println("Element not found");
            }
            else {
                prev.next = temp.next;
                temp = null;
            }
        }
    }


    public void insert(int index, int element){
        Node newNode = new Node(element);
        if(index == 0) {
            newNode.next = root;
            root = newNode;
        }
        else {
            Node temp = root;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
}
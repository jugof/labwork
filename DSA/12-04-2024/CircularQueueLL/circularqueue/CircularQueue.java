package circularqueue;

public class CircularQueue {
    Node root;
    Node tail;

    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (root == null) {
            root = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void dequeue() {
        if (root == null) {
            System.out.println("Queue is empty");
        }
        else {
            root = root.next;
            tail.next = root;
        }
    }

    public void insert_left(int element) {
        Node newNode = new Node(element);
        if(root == null) {
            root = newNode;
            tail = newNode;
        }
        else{
            newNode.next = root;
            root = newNode;
            tail.next = root;
        }
    }

    public void insert_right(int element) {
        Node newNode = new Node(element);
        if(root == null) {
            root = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = root;
        }
    }

    public void delete_left(){
        if(root == null) {
            System.out.println("Queue is empty");
        }
        else{
            if (root == tail) {
                root = tail = null;
            }
            else{
                root = root.next;
                tail.next = root;
            }
            
        }
    }

    public void delete_right(){
        if(root == null) {
            System.out.println("List is empty");
        }
        else{
            if (root == tail) {
                root = tail = null;
            }
            else{
                Node temp = root;
                while(temp.next != tail) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = root;
            }
        }
    }

    public void print_cir_queue(){
        Node temp = root;
        do {
            System.out.print("|" + temp.data + "|-- ");
            temp = temp.next;
        }while(temp != root);
    }
}

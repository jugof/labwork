package queue;

public class QueueLL {
    Node front;
    Node rear;

    public void enqueue(int element) {
        Node node = new Node(element);

        if(rear == null) {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
    }

    public void dequeue() {
        if(front == null) {
            System.out.println("Queue is empty");
        }
        else {
            Node temp = front;
            front = front.next;
            if(front == null) {
                rear = null;
            }
            temp = null;
        }
    }

    public void print_queue() {
        Node temp = front;
        while(temp != null) {
            System.out.print("| " + temp.data + " |-- ");
            temp = temp.next;
        }
    }
}

package example;

public class Linear_Queue {
    
    int queue[];
    int front;
    int rear;
    int maxsize;

    public void create_queue(int size ) {
        queue = new int[size];
        maxsize = size;
        front = 0;
        rear = -1;
    }

    public void enqueue(int element) {
        ++rear;
        queue[rear] = element;
    }

    public boolean isFull() {
        if(rear == maxsize - 1) {
            return true;
        }
        return false;
    }

    public int dequeue() {
        return queue[front++];
    }

    public boolean isEmpty() {
        if(front > rear) {
            return true;
        }
        return false;
    }

    public void print_queue() {
        for(int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

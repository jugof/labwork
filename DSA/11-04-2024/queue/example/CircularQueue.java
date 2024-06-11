package example;

public class CircularQueue {
    
    int queue[];
    int front;
    int rear;
    int maxsize;
    int count;

    public void create_queue(int size ) {
        queue = new int[size];
        maxsize = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int element) {
        rear = (rear+1) % maxsize;
        queue[rear] = element;
        ++count;
    }

    public boolean isFull() {
        if(count == maxsize) {
            return true;
        }
        return false;
    }

    public int dequeue() {
        --count;
        front = (front+1) % maxsize;
        return queue[front];
        

    }

    public boolean isEmpty() {
        if(count == 0) {
            return true;
        }
        return false;
    }

    public void print_queue() {
        int c=0;
        int i = front;
        while(c < count) {
            System.out.print(queue[i] + " ");
            i = (i+1) % maxsize;
            c++;
        }
        System.out.println();
    }
}

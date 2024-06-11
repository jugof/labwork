
import java.util.Scanner;

import example.CircularQueue;

public class QueueProgram {
    
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of Queue: ");
        int size = in.nextInt();
        cq.create_queue(size);

        int choice = 0;

        do{
            System.out.println("1. Enueque \n 2. Dequeue \n 3. Print Queue \n 4. Exit \n");
            choice = in.nextInt();

            switch(choice) {
                case 1: System.out.println("Enter the Element for Enqueue");
                        int element = in.nextInt();
                        cq.enqueue(element);
                        break;
                case 2: System.out.println("Dequeue: " + cq.dequeue());
            }
        } while(choice != 4);
          
    }
    
}

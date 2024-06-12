import java.util.Scanner;

import queue.QueueLL;



public class QueueProgram {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        
        int choice = 0;
        int val;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Enqueue \n 2. Dequque \n 3. Print Queue \n 0. Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to Enqueue in Queue");
                    val = in.nextInt();
                    queue.enqueue(val);   
                    break;
                
                case 2:
                    System.out.println("Dequeue an element");
                    queue.dequeue(); 
                    break;

                case 3:
                    queue.print_queue();
                    break;

                case 0: 
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice != 0);        
    }
}

import java.util.Scanner;

import circularqueue.CircularQueue;

public class CircularQueueProgram {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        
        int choice = 0;
        int val;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Insert Left \n 2. Insert Right \n 3. Delete Left \n 4. Dlete right \n 5. Print Linked list \n 0. Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to insert at left in Queue");
                    val = in.nextInt();
                    cq.insert_left(val);    
                    break;
                
                case 2:
                    System.out.println("Enter the value to insert at right");
                    val = in.nextInt();
                    cq.insert_left(val);    
                    break;

                case 3:
                    cq.delete_left();
                    break;
                
                case 4:
                    cq.delete_right();
                    break;

                case 5:
                    cq.print_cir_queue();  
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
 
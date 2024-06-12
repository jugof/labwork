import java.util.Scanner;

import doubly.CircularDoublyLL;

public class CircularDLLProgram {
    public static void main(String[] args) {
        CircularDoublyLL dll = new CircularDoublyLL();
        
        int choice = 0;
        int val;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Insert Left \n 2. Insert Right \n 3. Delete Left \n 4. Dlete right \n 5. Print DoublyLL Normally \n 6. Print DoublyLL Reversed \n 0. Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to insert at left");
                    val = in.nextInt();
                    dll.insert_left(val);    
                    break;
                
                case 2:
                    System.out.println("Enter the value to insert at right");
                    val = in.nextInt();
                    dll.insert_right(val);    
                    break;

                case 3:
                    dll.delete_left();
                    break;
                
                case 4:
                    dll.delete_right();
                    break;

                case 5:
                    System.out.println("Printing the Circular Doubly Linked List Normally");
                    dll.print_normal();  
                    break;

                case 6:
                    System.out.println("Printing the Circular Doubly Linked List Reversed");
                    dll.print_reverse();
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

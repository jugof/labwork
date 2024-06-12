import java.util.Scanner;

import list.LinkedList;

public class LLProgram {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        int choice = 0;
        int val;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Insert Left \n 2. Insert Right 3. Insert \n 4. Delete Left \n 5. Dlete right 6. Delete using Index & Key \n 7. Search Key \n 8. Print Linked list \n 0. Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to insert at left");
                    val = in.nextInt();
                    list.insert_left(val);    
                    break;
                
                case 2:
                    System.out.println("Enter the value to insert at right");
                    val = in.nextInt();
                    list.insert_left(val);    
                    break;

                case 3: 
                    System.out.println("Enter the value to insert");
                    val = in.nextInt();
                    int index = in.nextInt();
                    list.insert(index,val);
                    System.out.println(val + " inseted at the index " + index);
                    break;

                case 4:
                    list.delete_left();
                    break;
                
                case 5:
                    list.delete_right();
                    break;
                
                case 6: 
                    System.out.println("Enter the key to delete");
                    val = in.nextInt();
                    list.delete(val);
                    break;

                case 7:
                    System.out.println("Enter the value to search");
                    val = in.nextInt();
                    list.search(val);
                    break;

                case 8:
                    list.print_list();  
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

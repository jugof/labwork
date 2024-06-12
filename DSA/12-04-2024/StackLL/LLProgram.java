import java.util.Scanner;

import LLstack.StackWll;


public class LLProgram {
    public static void main(String[] args) {
        StackWll stack = new StackWll();
        
        int choice = 0;
        int val;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("1. Push \n 2. Pop \n 3. Top \n 4. Print Stack \n 0. Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to Push in Stack");
                    val = in.nextInt();
                    stack.push(val);   
                    break;
                
                case 2:
                    System.out.println("Popped an element");
                    stack.pop();   
                    break;

                case 3: 
                    System.out.println("The tos of Stack " + stack.top());
                    break;

                case 4:
                    stack.print_stack(); 
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

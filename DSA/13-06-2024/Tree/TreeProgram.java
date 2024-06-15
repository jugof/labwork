import java.util.Scanner;

import build.Node;
import build.Tree;

public class TreeProgram {
    public static void main(String[] args) {
        Tree newTree = new Tree();        
        // in-printing, insert, search, count
        int choice = -1;
        int val;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1. Insert Node \n 2. Count total nodes \n 3. Search specific node \n4. Print Tree (Inorder Traversal) \n 0. Exit. " );
            System.out.println("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to insert: ");
                    val = in.nextInt();
                    Node newNode = new Node(val);
                    newTree.insert_node(newTree.root, newNode);
                    break;
                
                case 2:
                    System.out.println("Total nodes in the tree: " + newTree.count(newTree.root));
                    break;
                
                case 3:
                    System.out.println("Enter the value to search: ");
                    val = in.nextInt();
                    if (newTree.search(newTree.root, val))
                        System.out.println("Node found!");
                    else
                        System.out.println("Node not found!");
                    break;

                case 4:
                    System.out.println("Inorder Traversal: ");
                    newTree.print_inorder(newTree.root);
                    break;
                
                case 0:
                    System.out.println("Exiting...");
                    break;

                default :
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while(choice != 0);
    }
}

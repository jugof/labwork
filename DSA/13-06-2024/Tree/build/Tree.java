package build;

/**
 * Tree
 */
public class Tree {
    
    public Node root;

    public void insert_node(Node head, Node newNode) {
        
        if (root == null) {
            root = newNode;
            System.out.println(newNode.data + " Inserted as data");
        }
        else{
            // inserting in BST form
            if(head.data > newNode.data) {
                if(head.left == null) {
                    root.left = newNode;
                }
                else {
                    insert_node(head.left, newNode);
                }
            }
            else {
                if(head.data < newNode.data) {
                   if(head.right == null){
                    root.right = newNode;
                   } 
                   else {
                    insert_node(head.right, newNode);
                   }
                }
            }
        }
    } 


    public int count(Node head){

        if(head == null)
            return 0;

        return count(head.left) + count(head.right) + 1;        
    }
        

    public boolean search(Node head, int key) {
        if(root == null){
            return false;
        }
        else if(root.data == key){
            return true;
        }
        else if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    // In-Order printing 
    public void print_inorder(Node head) {
        if(head == null) {
            return;
        }
        print_inorder(head.left);
        System.out.print(head.data + " ");
        print_inorder(head.right);
    }
 
}
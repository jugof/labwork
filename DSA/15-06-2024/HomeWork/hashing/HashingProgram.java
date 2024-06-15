package HomeWork.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashingProgram {
    
    public static void Hashing_linear_probing(HashMap map, Integer x) {
        
        Integer hash_index = x % 10;
        if(!map.containsKey(hash_index)){
            map.put(hash_index, x);
        }
        else{
            while(map.containsKey(hash_index)){
                hash_index = (hash_index + 1) % 10;
            }
            map.put(hash_index, x);
        }
    }

    public static void main(String[] args) {
        HashMap map = new HashMap<Integer, Integer>(10);
        Scanner in = new Scanner(System.in);
        int choice = -1;
        int val;
        do{
            System.out.println("1. Insert \n 2. Search \n 3. Print \n 0. Exit");
            System.out.println("Enter your choice: 1");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to insert:");
                    val = in.nextInt();
                    Hashing_linear_probing(map, val);
                    System.out.println(val+" is added in hash table");
                    break;

                case 2:
                    System.out.println("Enter the number to search:");
                    val = in.nextInt();
                    if(map.containsValue(val)){
                        System.out.println(val+" is found in hash table");
                    }
                    break;

                case 3:
                    System.out.println("Printing the Hash Table ");
                    System.out.println(map);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter the valid choice");
                    break;
            }
        } while(choice != 0);
    }
}

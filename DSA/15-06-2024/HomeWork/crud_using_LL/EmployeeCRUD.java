package HomeWork.crud_using_LL;

public class EmployeeCRUD {
    public EmpNode root;

    public void insert(String name, String gender, double salary) {
        EmpNode newNode = new EmpNode(name, gender, salary);

        if(root == null) {
            root = newNode;
        }
        else{
            EmpNode temp = root;
            while (temp.next != null) {
               temp = temp.next; 
            }
            temp.next = newNode;
        }
    }

    public void delete(int id) {
        //1 root is null
        if(root == null) {
            System.out.println("Empty Linked List ");
            return;
        }
        // 2 & 3 root ko delete karna hai & left most node ko delete
        if(root.id == id) {
            if(root.next == null){
                root = null;
            }
            else{
                root = root.next;
            }
        }
        // 4 & 5 middle node and right most node ko delete karna h
        else {
            EmpNode temp = root;
            EmpNode prev = temp;
            while(temp.id != id) {
                prev = temp;
                temp = temp.next;
            }
            // 5 right most node hai toh usko null par point karwa denge
            if(temp.next == null)
                prev.next = null;
            else
                prev.next = temp.next;
            temp.next = null;
        }
    }

    public void search(int id) {
        if(root == null) {
            System.out.println("Record is not present List is Empty");
        }
        else if(root.id == id) {
            System.out.println("Employee id: "+root.id + " Name: " + root.name + " Salary: " + root.salary + " Gender: " + root.gender);
        }
        else {
            EmpNode temp = root;
            while(temp.id != id) {
                temp = temp.next;
            }
            System.out.println("Employee is Prsent as Name: " + temp.name);
        }
    }

    public void print_genderwise(int gen) {
        if (root == null) {
            System.out.println("List is empty no employee is present");
        }
        else{
            EmpNode temp = root;
            String gender = gen == 1 ? "Male" : "Female" ; 
            while (temp != null) {
                if(temp.gender.equals(gender)){
                    System.out.println("Employee id: "+temp.id + " Name: " + temp.name + " Salary: " + temp.salary + " Gender: " + temp.gender);
                }
                temp = temp.next;
            }
        }
    }

    public void print() {
        if(root == null) {
            System.out.println("Employee list is empty");
        }
        else {
            EmpNode temp = root;
            while(temp != null) {
                System.out.println("Employee id: "+temp.id + " Name: " + temp.name + " Salary: " + temp.salary + " Gender: " + temp.gender);
                temp = temp.next;
            }
        }
    }
}

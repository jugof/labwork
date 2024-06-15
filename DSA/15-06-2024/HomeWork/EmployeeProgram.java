package HomeWork;

import java.util.Scanner;

import HomeWork.crud_using_LL.EmployeeCRUD;

public class EmployeeProgram {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice = -1;
        double salary;
        int id;
        String name, gender;
        EmployeeCRUD emp = new EmployeeCRUD();

        do{
            System.out.println("1. Create new Employee \n 2. Delete Employee \n 3. Search Employee\n 4. Search Gender Wise \n 5. Display all Employee \n 0. Exit" );
            System.out.println("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter employee name: ");
                    name = in.next();
                    System.out.println("Enter employee gender: ");
                    gender = in.next();
                    System.out.println("Enter Employee salary: ");
                    salary = in.nextDouble();
                    emp.insert(name, gender, salary);
                    break;

                case 2:
                    System.out.println("Emter Employee id to dalele: ");
                    id = in.nextInt();
                    emp.delete(id);
                    System.out.println("Employee deleted successfully");
                    break;

                case 3:
                    System.out.println("Enter Employee id to search: ");
                    id = in.nextInt();
                    emp.search(id);
                    break;

                case 4:
                    System.out.println("Select gender to get all Employee: 1. Male 2. Female");
                    id = in.nextInt();
                    emp.print_genderwise(id);
                    break;

                case 5: 
                    System.out.println("Printing all Employees");
                    emp.print();
                    break;

                case 0:
                    System.out.println("Exiting....");
                    break;
                
                default :
                    System.out.println("Enter valid choice...");
                    break;
                }
        } while(choice != 0);
    }
}

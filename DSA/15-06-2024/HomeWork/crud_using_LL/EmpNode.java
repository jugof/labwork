package HomeWork.crud_using_LL;

public class EmpNode {
    public static int eid = 1000;
    public int id;
    public String name;
    public String gender;
    public double salary;
    public EmpNode next;

    public EmpNode() {}

    public EmpNode(String name, String gender, double salary) {
        this.id = ++eid;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        next = null;
    }
}

package polynomial;

public class Addition_polynomial
{
public static void main(String args[])
{
    Linked_List_Polynomial obj=new Linked_List_Polynomial();
    Linked_List_Polynomial obj2=new Linked_List_Polynomial();
    obj.create_list();
    obj.read_polynomial(3);
    obj.print_list();
    obj2.create_list();
    obj2.read_polynomial(5);
    obj2.print_list();
    Node temp_r1=obj.root;
    Node temp_r2=obj2.root;
    Linked_List_Polynomial obj3=new Linked_List_Polynomial();
    obj3.create_list();
    //read till both roots are not over(null)-loop 
    //if temp_r1.power>temp_r2.power then insert node temp_r1 to obj3.insert_node 
    //if temp_r1.power<temp_r2.power then insert node temp_r2 to obj3.insert_node 
    //if temp_r1.power=temp_r2.power then insert node temp_r1.co+temp_r2.co to obj3.insert_node 
    

    }
}
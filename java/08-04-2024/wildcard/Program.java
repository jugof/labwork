/**
 * Program
 */
public class Program {

    public static void printStack(StackImp<?> sd){
        while(!sd.empty()){
            System.out.println(sd.pop());
        }
        sd.push("sneha");
    }

    public static void main(String[] args) {
        StackImp<String> aj = new StackImp<String>();
        aj.push("Juned");
        aj.push("bhagyashri");
        aj.push("Sunday");
        aj.push("Friday");
        aj.push("Holiday");
        aj.push("Mush");

        StackImp<Interval> i = new StackImp<Interval>();
        
        i.push(new Interval(4, 70));
        i.push(new Interval(3, 71));
        i.push(new Interval(2, 72));
        i.push(new Interval(1, 74));

        printStack(aj);
        printStack(i);
    }
}
public class program {
    
    public static void main(String[] args) {
        Box b = new Box(12, 10, 2);
        Box j = new Box(2, 12, 10);
        Box c = j;

        System.out.printf("The toString of B is  : %s%n", b.toString());
        System.out.printf("The toString of J is  : %s%n", j.toString());
        System.out.printf("The Identity comparision of B and J is  : %b%n",b == j);
        System.out.printf("The identity comparision of C and J is  : %b%n", j == c);
        System.out.printf("The identity comparision of B and C is  : %b%n", c == b);
        System.out.printf("The HashCode comparision of B and J is: %b%n", c.hashCode() == j.hashCode() && c.equals(j));
        System.out.printf("The equals comparision of B and J is  : %b%n", b.equals(j));
    }
}

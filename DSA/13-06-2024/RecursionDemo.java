public class RecursionDemo {

    public static int rec(int n){
        if(n < 0) {
            return 0;
        }
        return n + rec(n-1);
    }

    public static void main(String[] args) {
        
        int n = 10;
        System.out.println("Total of 1 to N is : " + rec(n));
    }
}

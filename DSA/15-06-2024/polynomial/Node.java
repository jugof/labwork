package polynomial;

/**
 * Node
 */
public class Node {

    float co;
    int power;
    Node next;

    public Node() {
    }

    public Node(float co, int power) {
        this.co = co;
        this.power = power;
        this.next = null;
    }
}
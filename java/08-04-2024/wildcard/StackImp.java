/**
 * stackImplementation
 */
class StackImp<V> {

    private Node top = null;

    class Node{
        V value;
        Node prev;

        Node(V item) {
            value =  item;
            prev = top;
        }
    }

        public void push(V item){
            top = new Node(item);
        }
    

        public V pop(){
            V item = top.value;
            top = top.prev;
            return item;
        }

        public boolean empty(){
            return top == null;
        }
}
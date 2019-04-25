public class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public int getVal() {
        return val;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    public void setVal(int value) {
        val = value;
    }

}
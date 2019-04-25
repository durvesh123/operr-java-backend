public class OperrLinkedList {

    Node head;

    public void append(int val) {

        Node nodeToAdd = new Node(val);
        if (head == null) {
            head = nodeToAdd;
        }
        Node temp = head;
        if (temp != null) {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(nodeToAdd);
        }

    }

    public void removeTail() {

        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);

    }

    public void removeNodesGreaterThanValue(int val) {

    }

}
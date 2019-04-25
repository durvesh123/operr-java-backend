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

    public void removeNodesGreaterThanValue(int value) {
        if (head == null) {
            return;
        }
        Node temp = head, prev;
        // removing all head nodes having val > value
        while (temp.getNext() != null && temp.getVal() > value) {
            head = temp.getNext();
            temp = head;
        }
        // removal of remaining nodes
        while (temp.getNext() != NULL) {
            while (temp.getNext() != null && temp.getVal() <= value) {
                prev = temp;
                temp = temp.getNext();
            }
            if (temp == NULL)
                return;

            prev.setNext(temp.getNext());
            temp = prev.getNext();
        }
    }

}
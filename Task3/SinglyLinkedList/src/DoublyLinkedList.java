public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int value) { data = value; prev = next = null; }
    }

    private Node head;

    public void insert_front(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insert_end(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
    }

    public void delete(int value) {
        Node curr = head;
        while (curr != null && curr.data != value) {
            curr = curr.next;
        }
        if (curr == null) return;
        if (curr.prev != null) curr.prev.next = curr.next;
        else head = curr.next;
        if (curr.next != null) curr.next.prev = curr.prev;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

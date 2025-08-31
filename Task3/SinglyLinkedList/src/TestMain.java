public class TestMain {
    public static void main(String[] args) {
        System.out.println("Singly Linked List:");
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert_end(10);
        sll.insert_front(5);
        sll.insert_end(15);
        sll.delete(10);
        sll.display();

        System.out.println("\nDoubly Linked List:");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert_front(20);
        dll.insert_end(30);
        dll.insert_end(40);
        dll.delete(30);
        dll.display();

        System.out.println("\nBinary Search Tree:");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.inOrderTraversal();
        bst.delete(70);
        bst.inOrderTraversal();
        System.out.println("Search 60: " + bst.search(60));
    }
}

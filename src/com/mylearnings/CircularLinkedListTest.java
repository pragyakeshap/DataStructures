public class CircularLinkedListTest {

    public static void main(String args[]){

        CircularLinkedList cll = new CircularLinkedList();
        cll.printCircularList();;
        cll.insertNodeAtBeginning(1);
        cll.insertNodeAtEnd(2);
        cll.printCircularList();  // 1 2
        cll.insertNodeAtBeginning(-1);
        cll.insertNodeAtEnd(3);
        cll.printCircularList();// -1 1 2 3
        cll.deleteNode(-1);
        cll.printCircularList(); // 1 2 3
        cll.deleteNode(2);
        cll.printCircularList(); // 1 3
        cll.deleteNode(-1);
        cll.printCircularList(); // 1 3
    }

}

public class DoublyLinkedList {
    Node head;
    Node tail;

    public Node addNodeAtEnd(int val){
        Node newNode = new Node(val);

        // First node to be inserted
        if(head == null){
            head = newNode;
        }else{
            // traverse till end
            Node current = head;
            while(current!=null && current.next !=null){
                current = current.next;
            }
            if(current != null){
                current.next = newNode;
                newNode.previous = current;
                tail = newNode;
            }
        }
        return head;

    }

    private class Node{
        int value;
        Node previous;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
}

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public void printCircularList(){
        if(head == null){
            System.out.println("Empty List");
        } else{
            Node current = head;
            while(current != tail){
                System.out.print(current.value+ " ");
                current = current.next;
            }
            if(current == tail){
                System.out.println(current.value+ " ");
            }
        }

    }

    public Node insertNodeAtBeginning(int value){
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            head.next = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head= newNode;
            tail.next = head;
        }
        return head;
    }

    public Node insertNodeAtEnd(int value){
        Node newNode = new Node(value);
        if(head == null){
            // Insert first Node
            head = newNode;
            newNode.next = head;
            tail = newNode;
        }else if(tail != null){
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        return head;
    }

    public Node deleteNode(int value){
        Node current = head;
        // first node needs to be deleted
        if(current.value == value){
            head = head.next;
            tail.next = head;
            return head;
        }
        while(current != null && current.next != null && current.next.value != value ){
            // reached the end of the list, but value not found
            if(current == tail){
                return head;
            }
            current = current.next;
        }
        if(current.next.value == value){
            if(current.next == tail){
                tail = current;
            }
            current.next = current.next.next;
        }
        return head;
    }

    private class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }

    }
}

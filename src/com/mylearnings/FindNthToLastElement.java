public class FindNthToLastElement {

    public static void main(String args[]){
        LinkedList myList = new LinkedList(1);
        myList.addNodeAtEnd(2);
        myList.addNodeAtEnd(3);
        myList.addNodeAtEnd(4);
        myList.addNodeAtEnd(5);
        myList.addNodeAtEnd(6);
        myList.addNodeAtEnd(7);

        System.out.println(myList.toString());
        System.out.println(nthToLast(myList,3));
    }

    public static Integer nthToLast(LinkedList ll , Integer n ){
        Node first = ll.head;
        Node second = first;
        for(int i=0; i <n-1; i++){
            if(first.next != null){
                first = first.next;
            }else{
                System.out.println("List has less than n elements");
                return 0;
            }
        }
        while(first.next != null){
            first = first.next;
            second = second.next;
        }

        return second.value;
    }
}

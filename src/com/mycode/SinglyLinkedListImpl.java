package com.mycode;
  
public class SinglyLinkedListImpl<T> {
  
    private ListNode<T> head;
      
    public void add(T element){
          
        ListNode<T> nd = new ListNode<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        ListNode<T> tmp = head;
        while(true){
            if(tmp == null){
                //since there is only one element, both head and 
                //tail points to the same object.
                head = nd;
                break;
            } else if(tmp.getNextRef() == null){
                tmp.setNextRef(nd);
                break;
            } else {
                tmp = tmp.getNextRef();
            }
        }
    }
      
    public void traverse(){
          
        ListNode<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.print(tmp.getValue()+"\t");
            tmp = tmp.getNextRef();
        }
    }
     
    public void reverse(){
         
        System.out.println("\nreversing the linked list\n");
        ListNode<T> prev = null;
        ListNode<T> current = head;
        ListNode<T> next = null;
        while(current != null){
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
     
    public static void main(String a[]){
        SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        System.out.println();
        sl.traverse();
        System.out.println();
        sl.reverse();
        sl.traverse();
    }
}
  
class ListNode<T> implements Comparable<T> {
      
    private T value;
    private ListNode<T> nextRef;
      
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public ListNode<T> getNextRef() {
        return nextRef;
    }
    public void setNextRef(ListNode<T> ref) {
        this.nextRef = ref;
    }
    @Override
    public int compareTo(T arg) {
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}

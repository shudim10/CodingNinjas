package StacksUsingLL;

public class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T value){
        this.data = value;
        this.next=null;
    }
}

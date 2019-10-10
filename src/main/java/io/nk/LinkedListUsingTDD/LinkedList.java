package io.nk.LinkedListUsingTDD;

public class LinkedList<T> {

    private int size=0;
    private Node header;

    public int size() {
        return size;
    }

    public void add(T a) {
        size++;
        if(header==null){
            header=new Node(a);
        }else{
            Node temp=header;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(a);
        }
    }

    public T get(int i) {
            Node temp = header;
            while (i>0) {
                i--;
                temp = temp.next;
            }
            return temp.value;
    }

    public T remove(int value) {
        size--;
        Node temp=header;
        Node previous=null;
        while (value>0){
            value--;
            previous=temp;
            temp=temp.next;
        }
        if(previous==null){
            header=temp.next;
        }else {
            previous.next = temp.next;
        }
        return temp.value;
    }


    private class Node{
        private final T value;
        private Node next;
        public Node(T value){
                this.value=value;
        }
    }
}

package io.nk.LinkedListUsingTDD;

public class LinkedList<T> {

    private Node header;

    public int size() {
        int count=0;
        Node node=header;
        while(node!=null){
            node=node.next;
            count++;
        }
        return count;
    }

    public void add(T a) {
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

    @Override
    public String toString(){
        StringBuffer stringBuffer=new StringBuffer();
        Node node=header;
        Node temp=null;
        while (node!=null){
            temp=node;
            stringBuffer.append("<"+temp.value+">"+", ");
            node=node.next;
        }
        return stringBuffer.toString();
    }

    private class Node{
        private final T value;
        private Node next;
        public Node(T value){
                this.value=value;
        }
    }

}

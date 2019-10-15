package io.nk.test;

import java.util.EmptyStackException;

public class StackLinkedLinkedList<T> {
    private Node header;
    private int size;

    public StackLinkedLinkedList() {
        header = new Node(null);
        size=0;
    }

    public void push(T item) {
        size++;
        Node newNode = new Node(item);
        if (isEmpty()) {
            header.next = newNode;
        } else {
            Node first = header.next;
            header.next = newNode;
            newNode.next = first;
        }
    }

    public T peek() {
        if (isEmpty()) {
           // throw new EmptyStackException();
            return null;
        }
        return header.next.value;
    }

    public T pop() {
        size--;
        if (isEmpty()) {
           // throw new EmptyStackException();
            return null;
        }
        Node first = header.next;
        Node temp = first;
        header.next = first.next;
        first = null;
        return temp.value;
    }

    public boolean isEmpty() {
        return header.next == null;
    }

    public int size(){
        return size;
    }

    public boolean contains(T value){
        boolean contains=false;
        if(isEmpty()){
            return contains;
        }
        Node temp=header.next;
        while(temp!=null){
            if(temp.value.equals(value)){
                contains=true;
                break;
            }
            temp=temp.next;
        }
        return contains;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        Node first = header.next;

        while (first != null) {
            str.append("<" + first.value + ">"+", ");
            first = first.next;
        }
        return str.toString();
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        StackLinkedLinkedList<String> stack = new StackLinkedLinkedList<>();
        stack.push("Nigus");
        stack.push("Seli");
        stack.push("Bob");
        System.out.println("Contains returns : "+stack.contains("Nigus"));
        System.out.println("Contains returns : "+stack.contains("Seli"));
        System.out.println("Contains returns : "+stack.contains("Bob"));

        System.out.println("Stack Element is : "+stack+" The size of the stack is : "+stack.size());
        System.out.println("Peeking Element : "+stack.peek());
        System.out.println("Stack Element is : "+stack+"After Peeking The size of the stack remains : "+stack.size());

        System.out.println("\n");

        System.out.println("Popping Element : "+stack.pop());
        System.out.println("Stack Element is : "+stack+" After Popping The size of the stack decreases to : "+stack.size());
        System.out.println("Popping Element : "+stack.pop());
        System.out.println("Stack Element is : "+stack+" After Popping The size of the stack decreases to : "+stack.size());;
        System.out.println("Popping Element : "+stack.pop());
        System.out.println("Stack Element is : "+stack+" After Popping The size of the stack decreases to : "+stack.size());

        System.out.println("\n");

        System.out.println("If The Element not found in the Stack, contains returns : "+stack.contains("Bob"));
        System.out.println("If The Stack is Empty contains returns : "+stack.contains("Bob"));
        System.out.println("If The Stack is Empty peeking returns : "+stack.peek());
        System.out.println("If The Stack is Empty popping returns : "+stack.pop());
    }
}

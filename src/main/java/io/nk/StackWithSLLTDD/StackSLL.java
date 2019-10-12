package io.nk.StackWithSLLTDD;

public class StackSLL<T> {

    private Node first;

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T ob) {
        if (isEmpty()) {
            first = new Node(ob);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(ob);
        }

    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }

        Node last = first;
        Node previousNode = null;
        while (last.next != null) {
            previousNode = last;
            last = last.next;
        }
        if (previousNode == null) {
            last = first;
            first = null;
        } else {
            previousNode.next = null;
        }
        return last.value;
    }

    public Object peek() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        Node last = first;
        while (last.next != null) {
            last = last.next;
        }
        return last.value;
    }

    public int size() {
        int count = 0;
        Node temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean contains(T ob) {
        boolean contains = false;
        if (isEmpty()) {
            return contains;
        }
        Node temp = first;
        while (temp != null) {
            if (temp.value.equals(ob)) {
                contains = true;
                break;
            }
            temp = temp.next;
        }
        return contains;
    }

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }
}

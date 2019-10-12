package io.nk.StackWithSLLTDD;

public class StackSLL {

    private Object object;
    private int size;

    public boolean isEmpty() {
        return object == null;
    }

    public void push(Object ob) {
        size++;
        object = ob;
    }

    public Object pop() throws Exception {
        if(isEmpty()){
            throw new Exception();
        }
        Object result = object;
        object = null;
        return result;
    }

    public Object peek() throws Exception {
        if(isEmpty()){
            throw new Exception();
        }
        return object;
    }

    public int size() {
        return size;
    }
}

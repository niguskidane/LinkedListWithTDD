package io.nk.StackWithSLLTDD;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//Methods to be Tested are
//isEmpty()
//push()
//pop()
//peek()
//contains

public class StackTest {

    private StackSLL<Object> stack=new StackSLL();;
    Object ob = "test";

    @Test
    public void testStack_isEmpty() {
        assertEquals(true, stack.isEmpty());
    }

    private void pushingOneElementInToTheStack(Object ob) {
        stack.push(ob);
    }

    private void pushingManyElementInToTheStack(Object ...ob) {
        for(Object o:ob){
            stack.push(o);
        }
    }

    @Test
    public void testStack_pushingOneElement() {
        pushingOneElementInToTheStack(ob);
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testStack_pushingManyOneElement() {
        pushingManyElementInToTheStack("Seli","Nigus","Anna","Bob");
        assertEquals(4, stack.size());
    }

    @Test(expected = Exception.class)
    public void testStack_popWithNoValue() throws Exception {
        popingOneElementFromTheStack();
    }

    @Test
    public void testStack_popWithOneValue() throws Exception {
        pushingOneElementInToTheStack(ob);
        popingOneElementFromTheStack();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void testStack_popingFromManyElement() throws Exception {
        pushingManyElementInToTheStack("Seli","Nigus","Anna","Bob");

        assertEquals("Bob", stack.pop());
        assertEquals(3, stack.size());
        assertEquals("Anna", stack.pop());
        assertEquals(2, stack.size());

    }

    @Test(expected = Exception.class)
    public void testStack_peekWithNoElement() throws Exception{
        peekingFromTheStack();
    }

    @Test
    public void testStack_peekWithElement() throws Exception{
        pushingOneElementInToTheStack(ob);
        peekingFromTheStack();
    }

    @Test
    public void testStack_peekingFromManyElement() throws Exception {
        pushingManyElementInToTheStack("Seli","Nigus","Anna","Bob");
        assertEquals("Bob", stack.peek());
        assertEquals(4, stack.size());
    }

    @Test
    public void testStack_containsWithNoElement() {
        assertEquals(false, stack.contains(ob));
    }

    @Test
    public void testStack_containsWithOneElement() {
        pushingOneElementInToTheStack(ob);
        assertEquals(true, stack.contains(ob));
    }

    @Test
    public void testStack_containsWithManyElement() {
        pushingManyElementInToTheStack("Seli","Nigus","Anna","Bob");
        assertEquals(true, stack.contains("Seli"));
        assertEquals(true, stack.contains("Bob"));
    }

    private void peekingFromTheStack() throws Exception {
        stack.peek();
    }

    private void popingOneElementFromTheStack() throws Exception {
        stack.pop();
    }

}

package io.nk.StackWithSLLTDD;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//Methods to be Tested are
//isEmpty()
//push()
//pop()
//peek()

public class StackTest {

    private StackSLL stack;
    Object ob = "test";
    @Before
    public void setUp() {
        stack = new StackSLL();
    }

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
    public void testStack_pop() throws Exception {
        pushingOneElementInToTheStack(ob);
        popingOneElementFromTheStack();
        assertEquals(true, stack.isEmpty());
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

    private void peekingFromTheStack() throws Exception {
        stack.peek();
    }

    private void popingOneElementFromTheStack() throws Exception {
        stack.pop();
    }

}

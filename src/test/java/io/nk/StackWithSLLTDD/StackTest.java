package io.nk.StackWithSLLTDD;


import org.junit.Assert;
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

    @Before
    public void setUp() {
        stack = new StackSLL();
    }

    @Test
    public void testStack_isEmpty(){
        assertEquals(true, stack.isEmpty());
    }



}

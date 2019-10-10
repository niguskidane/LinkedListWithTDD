package io.nk.LinkedListUsingTDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList<String> list;

    @Before
    public void setUp() throws Exception {
        list=new LinkedList<>();
    }

    @Test
    public void testSize_initialList(){
        assertEquals(0, list.size());
    }

    @Test
    public void testSize_oneElement_sizeIsOne(){
        list.add("a");
        assertEquals(1, list.size());
    }

    @Test
    public void testGet_oneElement(){
        givenAlistWithOneElement("a");
        String value=list.get(0);
        assertEquals("a", value);
    }


    @Test
    public void testGet_firstElementFromTwoElement(){
        givenAlistContaining("a", "b");
        String value=list.get(0);
        assertEquals("a", value);
    }


    @Test
    public void testGet_secondElementFromTwoElement(){
        givenAlistContaining("a", "b");
        String value=list.get(0);
        assertEquals("a", value);
    }

    private void givenAlistContaining(String ...elements) {
        for(String s: elements){
            list.add(s);
        }
    }

    private void givenAlistWithOneElement(String a) {
        list.add(a);
    }

    @After
    public void tearDown() throws Exception {
        list=null;
    }



}
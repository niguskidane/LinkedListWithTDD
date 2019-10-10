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
        givenAlistWithOneElement("a");
        assertEquals(1, list.size());
    }

    private void givenAlistContaining(String ...elements) {
        for(String s: elements){
            list.add(s);
        }
    }

    private void givenAlistWithOneElement(String a) {
        list.add(a);
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


    @Test
    public void testRemove_firstElementFromTwoElementList_elementWasFirst(){
        givenAlistContaining("a","b");
        String result=list.remove(0);
        assertEquals("a", result);

    }

    @Test
    public void testRemove_firstElementFromTwoElementList_sizeIsOne(){
        givenAlistContaining("a","b");
        whenTheFirstElementIsRemoved();
        assertEquals(1, list.size());

    }

    @Test
    public void testRemove_firstElementFromTwoElementList_firstElementIsOldSecondElement(){
        givenAlistContaining("a","b");
        whenTheFirstElementIsRemoved();
        assertEquals("b", list.get(0));

    }

    private void whenTheFirstElementIsRemoved() {
        list.remove(0);
    }


    @After
    public void tearDown() throws Exception {
        list=null;
    }



}
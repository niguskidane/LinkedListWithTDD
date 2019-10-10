package io.nk;

import io.nk.LinkedListUsingTDD.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Nigus");
        System.out.println(linkedList);
        linkedList.add("Seli");
        System.out.println(linkedList);
        linkedList.add("Bob");
        System.out.println(linkedList);
        linkedList.add("Anna");
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
    ;

    }
}

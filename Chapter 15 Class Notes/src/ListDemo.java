import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        // The addLast method can be used to populate a list
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");

        // The list is currently: TNPG
        /*
         * The listIterator method cretes a new list iterator
         * that is positioned at the head of the list.
         * The "|" is used to represent the iterator position
         */
        ListIterator<String> iterator = staff.listIterator(); // |TNPG

        /* The next method advances the iterator to the next element in the list */
        iterator.next(); // T/NPG

        /*The next method also returns the element that the iterator passes over.  */
        String avenger = iterator.next(); //TN/PG
        System.out.println(avenger);//Should print Natasha

        /*The add method inserts an element at the iterator position
         * The iterator is then positioned after the element that was added.
         */
        iterator.add("Steve");
        iterator.add("Clint");

        System.out.println(staff);

        /*The remove method removes the element returned by the last call to next or previous
         * The remove method can ONLY be called after calling next or prvious
         * The remove method can not be called after calling add
        */
        iterator.next();//TNSCP|G
        iterator.remove();
        System.out.println(staff);

        /*The set method updates the element returned by the last call
         * To next or previous.
         */
        iterator.previous();
        iterator.set("T'Challa");

        /*The hasNext method is used to determine if there is a next node
         * after the iterator. The hasNext method is often used in the condition
         * of a while loop.
         */
        iterator = staff.listIterator(); //|TNSTG
        while (iterator.hasNext())
        {
            String n = iterator.next();
            if (n.equals("Natasha")){
                iterator.remove();
            }
        }

        /*Enhanced for Loops work with Linnked lists */
        for(String n : staff){
            System.out.print(n + " ");
        }

        System.out.println();

        /*
         * ConcurrentModificationException
         * 
         * CANNOT modify a linked List while using an iterator.
         * UNLESS you use the iterator to do the modification
         */
        iterator = staff.listIterator(); //TSTG
        while (iterator.hasNext()) {
            String n = iterator.hastNext();
            if (n.equals("Tony"))
            {
                //staff.remove("Tony") ConcurrentModificationException
            }
        }

        /*The enhanced for Loop AUTOMATICALLY create and itterator */
        for(String n: staff){
            if(n.equals("Tony")){
                staff.add("Bruce");
            }
        }
    }
}

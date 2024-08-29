import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        LinkedList<String> newList = new LinkedList<String>();
        ListIterator<String> iter = strings.listIterator();
        
        for(String n: strings)
        {
            newList.addFirst(n);
        }
        while(iter.hasNext())
        {
            iter.next();
            iter.remove();
        }
        ListIterator<String> iter2 = newList.listIterator();
        while(iter2.hasNext())
        {
            iter.add(iter2.next());
            iter2.remove();
        }
        
    }
}
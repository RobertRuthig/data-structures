import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Business utility methods.
*/
public class Business
{
    /**
      * Removes every nth element from the linked list
      *
      * @param employeeNames the linked list to remove from
      * @param n                 the parameter to determine "nth"
     */
    public static void downsize(LinkedList<String> employeeNames, int n)
    {
        ListIterator<String> iter = employeeNames.listIterator();
        int count = 0;
        while(iter.hasNext())
        {
            if(count == n)
            {
                count = 0;
                iter.remove();
            }
            else
            {
                count++;
                iter.next();
            }
        }
        if(count == n)
        {iter.remove();}
    }
}

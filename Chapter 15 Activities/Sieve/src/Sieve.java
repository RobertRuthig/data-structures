
import java.util.*;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        Set<Integer> nums = new HashSet<>();
        // Your work goes here
        for(int i=1; i<n; i++)
        {
            nums.add(i);
        }
        for(int i = 2; i<n; i++)
        {
            for(int j = 2; j<n; j++)
            {
                if(nums.contains(j*i))
                {
                    nums.remove(j*i);
                }
            }
        }
        for(int i: nums)
        {
            System.out.println(i);
        }







    }
}

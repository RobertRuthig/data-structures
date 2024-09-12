import java.util.*;

/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        HashMap<String, String> students = new HashMap<String, String>();

        String name;
        String grade;
        boolean done = false;
        while(!done)
        {
            
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("What is the students name?");
                name = in.next();
                System.out.println("what is the students grade?");
                grade = in.next();
                students.put(name, grade);

            } else if (input.equals("R"))
            {
                System.out.println("What is the students name?");
                name = in.next();  
                students.remove(name);
            } else if (input.equals("M"))
            {
                System.out.println("What is the students name?");
                name = in.next();   
                System.out.println("what is the students new grade?");
                grade = in.next();
                students.replace(name, grade);
            } else if (input.equalsIgnoreCase("P"))
            {
                for(String k: students.keySet())
                {
                    System.out.println(k+": "+students.get(k));
                }
            } else
            {
                done = true;
            }
        }
    }
}

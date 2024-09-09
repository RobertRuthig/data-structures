import java.io.*;
import java.util.*;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        Set<String> dictionaryWords = readWords("Chapter 15 Class Notes/src/words");
        Set<String> novelWords = readWords("Chapter 15 Class Notes/src/war-and-peace.txt");

        // Print all the words that are in the novel, but not the dictionary
        for(String word : novelWords)
        {
            if (!dictionaryWords.contains(word))
            {
                System.out.println(word);
            }
        }

        System.out.println("There are " + novelWords.size() + "unique words in the novel.");

        Iterator<String> iterator = novelWords.iterator();
        while(iterator.hasNext()) 
        {
            if (iterator.next().length() <= 3)
            {
                iterator.remove();
            }
        }
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        //Use a HashSet instead of a TreeSet because the order doesn't matter
        Set<String> words = new HashSet<>();

        //Determine the current working directory
        //System.out.println(System.getProperty("user.dir"));

        Scanner in = new Scanner(new File(filename), "UTF-8");

        //Use any character that's not a letter as a delimeter
        in.useDelimiter("[^a-zA-Z]+");

        while (in.hasNext()){
            words.add(in.next().toLowerCase());
        }
        return words;
    }
}

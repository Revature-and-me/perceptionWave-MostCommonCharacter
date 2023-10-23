import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        //create frequency map, mapped to Character and integer amount as hashmap 
        Map<Character, Integer> charfrequency = new HashMap<>();
        //create char array of input String
        char[] charArray = str.toCharArray();
        //init maxFrequency
        int maxFrequency = 0;
        //init maxChar
        char maxChar = ' ';
        //iterate charArray
        for (char c : charArray) {
            //check to add char frequency
            if (charfrequency.containsKey(c)){
                int frequency = charfrequency.get(c)+1;
                charfrequency.put(c, frequency);
                //allocate maxFrequency
                if (frequency>maxFrequency){
                    maxFrequency = frequency;
                    maxChar = c;
                }
            } else {
                //put initial frecuency of char
                charfrequency.put(c, 1);
            }
        }
        return maxChar;
    }
}

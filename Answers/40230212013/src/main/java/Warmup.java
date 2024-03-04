import java.util.Scanner;

public class Warmup {
   /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] araye = sentence.split(" ");
        if(number > araye.length-1)
        {
            return " Number = "+String.valueOf(number)+" is out Of Bound";
        }
        return araye[number-1];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
            int count = 0;
        
            for (int i = 0; i < number.length(); i++) {
                if (searchForEven) {
                    if (Character.isDigit(number.charAt(i)) && number.charAt(i) % 2 == 0) {
                        count++;
                    }
                } else {
                    if (Character.isDigit(number.charAt(i)) && number.charAt(i) % 2 != 0) {
                        count++;
                    }
                }
            }
        
            return count;
        }
           

    
    

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {

  int minLength = Math.min(wordA.length(), wordB.length());
  
  for (int i = 0; i < minLength; i++) 
  {
    char charA = wordA.charAt(i);
    char charB = wordB.charAt(i);
    
    if (charA != charB)
     {
      return charA < charB ? wordA : wordB;
    }
  }
  
  if (wordA.length() == wordB.length()) 
  {
    return wordA;
  }
   else 
   {
    return wordA.length() < wordB.length() ? wordA : wordB;
  }
    }
}

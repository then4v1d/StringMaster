import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        boolean test = true;
        StringBuilder str = new StringBuilder();

        for(int i=0 ; i<sentence.length() ; i++)
        {
            if(sentence.charAt(i)==word.charAt(0))
            {
                int z = i;
                for(int j=1 ; j < word.length() ; j++)
                {
                    if(sentence.charAt(z+j)!=word.charAt(j))
                    {
                        test = false;
                        break;
                    }
                }
                if(test)
                {
                    for(int k = 0 ; k < newWord.length() ; k++)
                    {
                        str.append(newWord.charAt(k));
                        
                    }
                     i = i+word.length();
                }
            }
            if(i>=sentence.length())
            {
                break;
            }
            str.append(sentence.charAt(i));
        }
        String newSentence = str.toString();
        return newSentence;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        return null;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        return null;
    }
}


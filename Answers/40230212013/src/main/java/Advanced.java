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
        String newString;
        char c = firstName.charAt(0);
        int value = (int) c;
        if(value>90)
    {
        c = (char)(value-32);
    }        
    StringBuilder str = new StringBuilder();
    str.append(c);
    for(int i=1 ; i<firstName.length() ; i++)
    {
        c = firstName.charAt(i);
        value = (int) c;
        if(value < 97 )
        {
            c = (char)(value+32);
            str.append(c);
            continue;
        }
        str.append(c);
    }
         c = lastName.charAt(0);
         value = (int) c;
        if(value>90)
    {
        str.append(" ");
        c = (char)(value-32);
           str.append(c);
    for(int i=1 ; i<lastName.length() ; i++)
    {
        c = lastName.charAt(i);
        value = (int) c;
        if(value < 97 )
        {
            c = (char)(value+32);
            str.append(c);
            continue;
        }
        str.append(c);
    }
     newString = str.toString();
    } 
    else if(value == 32)
    {
         newString = str.toString();
    }
    else
    {
        str.append(" ");
        str.append(c);
        for(int i=1 ; i<lastName.length() ; i++)
        {
            c = lastName.charAt(i);
            value = (int) c;
            if(value < 97 )
            {
                c = (char)(value+32);
                str.append(c);
            }
            str.append(c);
        }
         newString = str.toString();
    }
 
    return newString;
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


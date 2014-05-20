/**
 * Created by gm68239 on 5/20/2014.
 */
public class StringManipulation {

    public static String removeEvens(String inputString){
        String outputString = "";
        char[] charArray = inputString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i%2 == 0) {
                outputString = outputString + charArray[i];
            }
        }
        System.out.println(outputString);
        return outputString;
    }

    public static String removeVowels(String inputString){
        String vowels = "aeiou";
        String outputString = new String();
        char[] stringBits = inputString.toCharArray();

        //need to add the additional piece to remove the vowels from the inputString

        return outputString;
    }

}

public class LettersList
{
    public static String[] getLettersList(String word) {
        int length = word.length();
        String[] letters = new String[length];
        for (int i = 0; i < length; i++) {
            letters[i] = word.substring(i, i + 1);
        }
        return letters;
    }
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    /* Complete the getLettersList method that get the list of letters in the input word. */
}
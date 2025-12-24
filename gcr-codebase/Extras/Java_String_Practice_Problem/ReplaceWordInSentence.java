import java.util.Scanner;
public class ReplaceWordInSentence {

    // User-defined replace method
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        int i = 0;

        while (i < sentence.length()) {

            // Check if oldWord matches starting at index i
            if (i + oldWord.length() <= sentence.length() &&
                sentence.substring(i, i + oldWord.length()).equals(oldWord)) {

                result += newWord;
                i += oldWord.length(); // skip old word
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = input.next();

        System.out.print("Enter new word: ");
        String newWord = input.next();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified Sentence:");
        System.out.println(modifiedSentence);
    }
}

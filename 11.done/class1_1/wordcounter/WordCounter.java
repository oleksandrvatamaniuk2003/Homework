package wordcounter;

public class WordCounter {
    public static void main(String[] args) {
        String inputText;
        if (args.length > 0) {
            inputText = args[0];
        } else {
            inputText = "This is a sample text. Count the number of words.";
        }
        int wordCount = countWords(inputText);
        System.out.println("Number of words: " + wordCount);
    }
    private static int countWords(String text) {
        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(text);
        return tokenizer.countTokens();
    }
}

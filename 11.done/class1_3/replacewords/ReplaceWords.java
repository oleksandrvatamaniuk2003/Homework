package replacewords;

public class ReplaceWords {
    public static void main(String[] args) {
        String inputText = "This is a small example. The small dog is playing.";
        String replacedText = replaceWords(inputText);
        System.out.println("Original Text: " + inputText);
        System.out.println("Modified Text: " + replacedText);
    }
    private static String replaceWords(String text) {
        return text.replace("small", "very large");
    }
}
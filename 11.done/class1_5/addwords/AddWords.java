package addwords;

public class AddWords {
    public static void main(String[] args) {
        String inputText = "This is a small example. The large dog is playing.";
        String modifiedText = addWords(inputText);
        System.out.println("Original Text: " + inputText);
        System.out.println("Modified Text: " + modifiedText);
    }
    private static String addWords(String text) {
        return text.replaceAll("\\b(small|large)\\b", "very $1");
    }
}

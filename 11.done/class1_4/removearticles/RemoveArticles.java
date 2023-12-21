package removearticles;

public class RemoveArticles {
    public static void main(String[] args) {
        String inputText = "She sells sea shells at the sea shore, I sell sea shells, Im sure. A ball was kicked by a boy 11 times in a row";
        String modifiedText = removeArticles(inputText);
        System.out.println("Original Text: " + inputText);
        System.out.println("Modified Text: " + modifiedText);
    }
    private static String removeArticles(String text) {
        return text.replaceAll("\\b(?:a|an|the)\\b\\s*", "");
    }
}

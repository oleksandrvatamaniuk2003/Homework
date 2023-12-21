package reversetext;
public class ReverseText {
    public static void main(String[] args) {
        String inputText;
        if (args.length > 0) {
            inputText = args[0];
        } else {
            inputText = "This is a sample text to reverse.";
        }
        String reversedText = reverseText(inputText);
        System.out.println("Original Text: " + inputText);
        System.out.println("Reversed Text: " + reversedText);
    }
    private static String reverseText(String text) {
        StringBuffer reversedBuffer = new StringBuffer(text);
        return reversedBuffer.reverse().toString();
    }
}

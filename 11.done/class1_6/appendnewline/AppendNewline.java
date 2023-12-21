package appendnewline;

public class AppendNewline {
    public static void main(String[] args) {
        String inputText = "This is a sample text.\nIt has multiple lines.\nEach line is a new sentence.";

        String modifiedText = appendNewline(inputText);
        System.out.println("Original Text:\n" + inputText);
        System.out.println("Modified Text:\n" + modifiedText);
    }
    private static String appendNewline(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        int length = stringBuffer.length();

        for (int i = 0; i < length; i++) {
            if (stringBuffer.charAt(i) == '\n') {
                stringBuffer.insert(i + 1, "new line, that we use to illustrate the methods of class StringBuffer");
                length = stringBuffer.length();
            }
        }

        return stringBuffer.toString();
    }
}

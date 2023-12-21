public class A {
    public static void main(String[] args) {
        char[] characters = { 'A', 'B', 'C', '4', '5', '6' };

        for (char c : characters) {
            String binaryRepresentation = convertCharToBinary(c);
            System.out.println("Binary representation of " + c + ": " + binaryRepresentation);
        }
    }

    public static String convertCharToBinary(char character) {
        int unicodeValue = (int) character;
        String binaryString = Integer.toBinaryString(unicodeValue);

        // Left-pad with zeros to make it 8 bits
        while (binaryString.length() < 8) {
            binaryString = "0" + binaryString;
        }

        return binaryString;
    }
}

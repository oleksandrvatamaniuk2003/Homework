public class ShiftOperations {

    public static void main(String[] args) {
        int initialValue = 0b10101100;  // 1010 1100 (з 1 у найменш значущій цифрі)
        // zsuv vlivo
        int leftShiftResult = initialValue << 1;
        System.out.println("Zsuv vliv: " + Integer.toBinaryString(leftShiftResult));
        // zsuv vpravo cherez usi dviykovi pozyzii
        int unsignedRightShiftResult = initialValue;
        for (int i = 0; i < 32; i++) {
            System.out.println("Bezpidpysanyi zsuv vpravo: " + Integer.toBinaryString(unsignedRightShiftResult));
            unsignedRightShiftResult >>>= 1;
        }
    }
}
public class BitwiseOperations {

    public static void main(String[] args) {
        int value1 = 0xFFFFFFF1;  // 1111 1111 1111 1111 1111 1111 1111 0001
        int value2 = 0xFFFFFFF2;  // 1111 1111 1111 1111 1111 1111 1111 0010
        // and
        int resultAnd = value1 & value2;
        System.out.println("AND: " + Integer.toBinaryString(resultAnd));
        // or
        int resultOr = value1 | value2;
        System.out.println("OR:  " + Integer.toBinaryString(resultOr));
        // xor
        int resultXor = value1 ^ value2;
        System.out.println("XOR: " + Integer.toBinaryString(resultXor));
        // vlivo
        int resultLeftShift = value1 << 1;
        System.out.println("Left Shift: " + Integer.toBinaryString(resultLeftShift));
        // zi znakom
        int resultRightShiftWithSign = value1 >> 1;
        System.out.println("Right Shift with Sign: " + Integer.toBinaryString(resultRightShiftWithSign));
        // bex
        int resultRightShiftWithoutSign = value1 >>> 1;
        System.out.println("Right Shift without Sign: " + Integer.toBinaryString(resultRightShiftWithoutSign));
    }
}

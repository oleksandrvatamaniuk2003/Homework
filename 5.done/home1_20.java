public class ISBNChecksum {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Будь ласка, введіть 9-значне число як аргумент командного рядка.");
            return;
        }
        try {
            long inputNumber = Long.parseLong(args[0]);
            if (isValidISBN(inputNumber)) {
                int checksum = calculateChecksum(inputNumber);
                long isbn = inputNumber * 10 + checksum;
                System.out.println("Контрольна сума: " + checksum);
                System.out.println("10-значний номер ISBN: " + isbn);
            } else {
                System.out.println("Введене число не є коректним 9-значним числом.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Помилка: Некоректний формат числа.");
        }
    }
    private static boolean isValidISBN(long number) {
        String numberString = String.valueOf(number);
        return numberString.length() == 9;
    }
    private static int calculateChecksum(long number) {
        int checksum = 0;

        for (int i = 1; i <= 9; i++) {
            int digit = (int) (number % 10);
            checksum += i * digit;
            number /= 10;
        }
        return checksum % 11;
    }
}

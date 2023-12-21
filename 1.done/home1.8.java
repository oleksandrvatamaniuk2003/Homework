/**
 * Програма для введення імені користувача через командний рядок.
 * Виводить введене ім'я користувача.
 */
public class VvedennyaImeni {

    /**
     * Головний метод програми, який викликається при запуску.
     * @param args Аргументи командного рядка. Очікується мінімум один аргумент - ім'я користувача.
     */
    public static void main(String[] args) {
        if (args.length >= 1) {
            String imyaKorystuvacha = args[0];

            System.out.println("Vvedene im'ya korystuvacha: " + imyaKorystuvacha);
        } else {
            System.out.println("Nedostatn'o argymentiv. Potribno vvesty im'ya korystuvacha.");
        }
    }
}

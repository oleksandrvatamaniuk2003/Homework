/**
 * Програма для введення імені користувача через командний рядок.
 * Виводить введене ім'я користувача.
 *
 * <p>Використання:</p>
 * <pre>java VvedennyaImeni &lt;ім'я_користувача&gt;</pre>
 *
 * <p>Приклад:</p>
 * <pre>java VvedennyaImeni John</pre>
 */
public class VvedennyaImeni {

    /**
     * Головний метод програми, який викликається при запуску.
     *
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


//javadoc VvedennyaImeni.java - komanda dlya perevirky

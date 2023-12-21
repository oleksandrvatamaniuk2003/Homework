import java.util.Scanner;

/**
 * Program for reading user input from the console and displaying a personalized greeting.
 */
public class GreetingProgram {
    public static void main(String[] args) {
        System.out.println("Введіть прізвище: ");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();

        // Display pryvITANNIA
        System.out.println("Привіт, " + surname + "!");

        System.out.println("Студент: [ВАШЕ ПРІЗВИЩЕ]");
        System.out.println("Час отримання завдання: [ЧАС]");
        System.out.println("Номер завдання: 2.1");

        scanner.close();
    }
}

//javadoc home2_1.java
